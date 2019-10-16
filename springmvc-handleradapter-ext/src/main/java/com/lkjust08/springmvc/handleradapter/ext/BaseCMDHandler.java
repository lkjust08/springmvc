package com.lkjust08.springmvc.handleradapter.ext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * description:
 *
 * @Author: likui
 * @Date: 19/10/16 12:12
 */
public interface BaseCMDHandler {

    void test(HttpServletRequest req, HttpServletResponse resp) throws IOException;
}
