package com.liuxn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 *
 * create by lxn
 * 2018/1/15 14:36
 */
@Controller
@RequestMapping("/mian")
public class MianController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());



    @RequestMapping("/tologin")
    public String tologin() {
        return "login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public void login(HttpServletRequest request, HttpServletResponse response){



    }
}
