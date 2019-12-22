package com.ims.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Administrator
 * @date 2019/12/21 21:31
 **/
@Controller
public class LoginController {
    @RequestMapping("")
    public String info(Model model){

        String userName ="sdfa";
        model.addAttribute("userName",userName);
        return "register";
    }
    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String login(String userName,String password,String status){


        return "login";
    }

}
