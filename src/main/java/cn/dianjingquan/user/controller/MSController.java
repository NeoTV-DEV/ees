package cn.dianjingquan.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * Created by tommy on 2016-10-25.
 * usercenter
 * cn.dianjingquan.user.controller.
 */
@RestController
@ApiIgnore
public class MSController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/health")
    public String home(){ return "heartbeat"; }

    @GetMapping("/info")
    public ServiceInstance showInfo() { return this.discoveryClient.getLocalServiceInstance(); }

}
