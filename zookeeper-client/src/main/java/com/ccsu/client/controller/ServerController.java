package com.ccsu.client.controller;

import com.ccsu.client.domain.MoUser;
import com.ccsu.client.remoteapi.ZookeeperServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wenzhenyu
 * @description
 * @date 2019/4/2
 */
@RestController
public class ServerController {

    @Autowired
    ZookeeperServer zookeeperServer;

    @RequestMapping("/test")
    public String test(){

        return "client hello World";
    }


    @RequestMapping("/testRemote")
    public String testRemote(){

        return zookeeperServer.remoteZookeeperServer();


    }



    @RequestMapping("/testOther")
    public List<MoUser> testOther(){

        return zookeeperServer.getList();


    }
}
