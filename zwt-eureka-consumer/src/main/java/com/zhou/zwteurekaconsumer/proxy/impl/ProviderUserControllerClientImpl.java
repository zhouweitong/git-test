package com.zhou.zwteurekaconsumer.proxy.impl;

import com.zhou.zwteurekaconsumer.proxy.ProviderUserControllerClient;
import org.springframework.stereotype.Component;

/**
 * 容错 处理类
 */
@Component
public class ProviderUserControllerClientImpl implements ProviderUserControllerClient {
    @Override
    public String login(String username, String password) {
        /*
        针对不同业务逻辑写不同代码
         */
        return "由于内部问题或网络问题，请稍后访问";
    }
}
