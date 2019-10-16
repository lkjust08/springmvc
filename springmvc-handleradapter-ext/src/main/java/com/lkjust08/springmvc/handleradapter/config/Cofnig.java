package com.lkjust08.springmvc.handleradapter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleServletHandlerAdapter;

/**
 * description:
 *
 * @Author: likui
 * @Date: 19/10/16 10:55
 */
@Configuration
public class Cofnig {

    /**
     * 注入Servlet类型的HandlerAdapter，用于测试BeanNameUrlHandlerMapping，bean为servlet，通过beanname匹配
     * @see com.lkjust08.springmvc.handleradapter.servlet.ServletAdapterServlet
     * @return
     */
//    @Bean
//    public SimpleServletHandlerAdapter simpleServletHandlerAdapter(){
//        return new SimpleServletHandlerAdapter();
//    }
}
