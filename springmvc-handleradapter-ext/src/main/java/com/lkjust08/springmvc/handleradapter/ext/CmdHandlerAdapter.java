package com.lkjust08.springmvc.handleradapter.ext;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.LastModified;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * description:
 *
 * @Author: likui
 * @Date: 19/10/16 12:16
 */
@Component("CmdHandlerAdapter")
public class CmdHandlerAdapter implements HandlerAdapter {

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof com.lkjust08.springmvc.handleradapter.ext.BaseCMDHandler);
    }

    @Override
    public ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        com.lkjust08.springmvc.handleradapter.ext.BaseCMDHandler cmd = (com.lkjust08.springmvc.handleradapter.ext.BaseCMDHandler) handler;
        cmd.test(request,response);
        return null;
    }

    @Override
    public long getLastModified(HttpServletRequest request, Object handler) {
        if (handler instanceof LastModified) {
            return ((LastModified) handler).getLastModified(request);
        }
        return -1L;
    }
}
