package cn.dianjingquan.user.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

/**
 * Created by tommy on 2016-10-19.
 * user center service
 * cn.dianjingquan.user.controller.
 */
@RestController
@RequestMapping("/v1/uc/user")
@Api("用户操作 API")
public class UserController {
    @RequestMapping(value = "/register/one",method = RequestMethod.POST)
    public String regByStepOne(){
        return "ok";
    }

    @RequestMapping(value = "/register/two",method = RequestMethod.POST)
    public String regByStepTwo(){
        return "ok";
    }

    @RequestMapping(value = "/nickname",method = RequestMethod.POST)
    public String setNickName(){
        return "ok";
    }

    @RequestMapping(value = "/avatar",method = RequestMethod.POST)
    public String setAvatar(){
        return "ok";
    }

    @RequestMapping(value = "/gender",method = RequestMethod.POST)
    public String setGender(){
        return "ok";
    }

    @RequestMapping(value = "/bgimg",method = RequestMethod.POST)
    public String setBgImg(){
        return "ok";
    }

    @RequestMapping(value = "/game",method = RequestMethod.POST)
    public String setGame(){
        return "ok";
    }

    @RequestMapping(value = "/pwd",method = RequestMethod.POST)
    public String updatePWD(){
        return "ok";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(){
        return "ok";
    }

    @RequestMapping(value = "/logout",method = RequestMethod.POST)
    public String logout(){
        return "ok";
    }

    @GetMapping("/nickname")
    public String getNickName(){
        return "ok";
    }

    @GetMapping("/mobile/{mobile}")
    public String getUserByMobile(@PathVariable String mobile){
        return "ok";
    }

    @GetMapping("/id/{id}")
    public String getUser(@PathVariable String id){
        return "ok";
    }
}
