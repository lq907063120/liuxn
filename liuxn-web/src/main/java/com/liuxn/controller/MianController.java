package com.liuxn.controller;

import com.liuxn.controller.base.BaseController;
import com.liuxn.entity.vo.model.Result;
import net.sf.json.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * create by lxn
 * 2018/1/15 14:36
 */
@Controller
@RequestMapping("/main")
public class MianController extends BaseController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());



    @RequestMapping("/tologin")
    public String tologin() {
        return "login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public void login(HttpServletRequest request, HttpServletResponse response){
        String username = request.getParameter("Username");
        String passWord = request.getParameter("Password");
        logger.info("[登陆]username：["+username+"],pwd:["+passWord+"]");
        Result result = new Result();
        result.setMsg("登陆成功");
        result.setCode("ok");
        this.writeApplicationJson(response,"");
    }
}
