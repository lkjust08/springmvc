package com.lkjust08.springmvc.handleradapter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * description:
 *
 * @Author: likui
 * @Date: 19/10/15 17:10
 */
@Controller
public class IndexController {


    @GetMapping("/index")
    @ResponseBody
    public String index(){
        return "index";
    }


}
