package com.lkjust08.springmvc.config;

import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.stereotype.Component;

/**
 * springboot中修改应用的prot的方法，也可以直接在application.properties中配置server.port
 * description:
 *
 * @Author: likui
 * @Date: 19/10/15 17:17
 */
@Component
public class WebServerFactoryCustomizer implements org.springframework.boot.web.server.WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {

    @Override
    public void customize(ConfigurableServletWebServerFactory factory) {
        factory.setPort(8081);
    }
}
