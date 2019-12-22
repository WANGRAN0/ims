package com.ims.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ims.entity.User;
import com.ims.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Administrator
 * @date 2019/12/22 11:14
 **/
@Controller
public class RegisterController {
    @Autowired
    private IUserService iUserService;
    @ResponseBody
    @RequestMapping(value = "verification",method = RequestMethod.POST)
    public String verification(String userName){
        QueryWrapper<User> cityQueryWrapper = new QueryWrapper<>();
        cityQueryWrapper.eq("userName",userName);
        List<User> userList =iUserService.list(cityQueryWrapper);
        if (userList!=null)
        {
            return "1";
        }else return "0";
    }
}
