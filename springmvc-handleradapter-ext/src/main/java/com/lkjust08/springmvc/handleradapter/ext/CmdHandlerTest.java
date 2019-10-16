package com.lkjust08.springmvc.handleradapter.ext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;

/**
 * description:
 *
 * @Author: likui
 * @Date: 19/10/16 12:12
 */
@Component("/cmdTest")
public class CmdHandlerTest implements com.lkjust08.springmvc.handleradapter.ext.BaseCMDHandler {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    public void test(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String username = req.getParameter("username");
        logger.info("username =" + username);
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter printWriter = resp.getWriter();
        try {
            printWriter.write("<head>");
            printWriter.write("<title>CmdTest</title>");
            printWriter.write("</head>");
            printWriter.write("<body>");
            printWriter.write("<h2>Servlet CmdTest at " +  InetAddress.getLocalHost()+ "</h2>");
            printWriter.write("<h2>Servlet CmdTest URI  " +  req.getRequestURI()+ "</h2>");
            printWriter.write("<h3> Welcome " + username + " come in servlet <h3/>");
            printWriter.write("</body>");
            printWriter.write("</html>");
        } finally {
            printWriter.close();
        }
    }
}
