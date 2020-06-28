package com.zhou.zwtgatewayzull.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

@Component
public class SecondFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        RequestContext ctx = RequestContext.getCurrentContext();
       //ctx.setSendZuulResponse(false);
        return ctx.sendZuulResponse();
    }

    @Override
    public Object run() {
        System.out.println("SecondFilter");
        return null;
    }
}
