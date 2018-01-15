package com.liuxn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * create by lxn
 * 2018/1/15 14:36
 */
@Controller
public class MianController {

    @RequestMapping("mian/tologin")
    public String tologin() {
        return "login";
    }
}
