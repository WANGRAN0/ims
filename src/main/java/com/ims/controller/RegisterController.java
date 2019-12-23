package com.ims.controller;

import com.alibaba.fastjson.JSONArray;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ims.entity.City;
import com.ims.entity.Nation;
import com.ims.entity.User;
import com.ims.service.ICityService;
import com.ims.service.INationService;
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
    private INationService iNationService;
    @Autowired
    private IUserService iUserService;
    @Autowired
    private ICityService iCityService;

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
    @ResponseBody
    @RequestMapping(value = "nation",method = RequestMethod.GET)
    public String nation(){
        QueryWrapper<Nation> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("nation","id");
        List<Nation> nations = iNationService.list();
        return JSONArray.toJSONString(nations);
    }

    @ResponseBody
    @RequestMapping(value = "province",method = RequestMethod.GET)
    public String province(){
        QueryWrapper<City> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("type","1");
        queryWrapper.select("cityname","id");
        List<City> provinces = iCityService.list(queryWrapper);
        return JSONArray.toJSONString(provinces);
    }
    @ResponseBody
    @RequestMapping(value = "city",method = RequestMethod.GET)
    public String city(String id){
        QueryWrapper<City> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("pid",id);
        queryWrapper.select("cityname","id");
        List<City> cityList = iCityService.list(queryWrapper);
        System.out.print(cityList);
        return JSONArray.toJSONString(cityList);
    }
}
