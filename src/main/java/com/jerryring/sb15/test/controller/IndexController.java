package com.jerryring.sb15.test.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author broker
 * @version v1.0
 * @date 2018-09-28
 */
@Controller
@RequestMapping(value = "/index")
public class IndexController {
    @RequestMapping(value = "/index")
    public String index() {
        return "hello world";
    }

    @RequestMapping(value = "/index1")
    public String index(Model map) {
        map.addAttribute("host", "localhost");
        return "index";
    }

    @RequestMapping("/hello")
    public String hello() throws Exception {
//        return "1";
        throw new Exception("error");
    }
}
