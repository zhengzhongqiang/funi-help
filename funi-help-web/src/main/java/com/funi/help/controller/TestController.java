package com.funi.help.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: zhongqiang.zheng
 * date: 2016/5/16
 * Description:
 */
@Controller
@RequestMapping("/")
public class TestController {

    @RequestMapping("")
    public String index(){
        return "index";
    }

    @RequestMapping("/index")
    public String indexPage() {
        return "index";
    }
}
