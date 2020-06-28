package com.zhou.bloggatewayzuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.zhou.bloggatewayzuul.util.RedisUtil;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Component
public class LoginFilter extends ZuulFilter {
    @Resource
    private RedisUtil redisUtil;

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        RequestContext ctx = RequestContext.getCurrentContext();
        return ctx.sendZuulResponse();
    }

    @Override
    public Object run() {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        System.out.println(request.getRequestURI());
        if(request.getRequestURI().contains("blogComment")){
            String token = request.getHeader("token");
            System.out.println(token);
            if(redisUtil.existKey(token)){
                requestContext.setSendZuulResponse(true);
                System.out.println("通过");
            }else{
                requestContext.setSendZuulResponse(false);
                HttpServletResponse response = requestContext.getResponse();
                response.setCharacterEncoding("utf-8");
                requestContext.setResponseBody("没登录或登陆失败");
            }
        }else{
            requestContext.setSendZuulResponse(true);
        }
        return null;
    }
}
