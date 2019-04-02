package com.ccsu.client.remoteapi.impl;

import com.ccsu.client.domain.MoUser;
import com.ccsu.client.remoteapi.ZookeeperServer;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author wenzhenyu
 * @description 实现类
 * @date 2019/4/2
 */
@Component
public class ZookeeperServerIMPL implements ZookeeperServer {


    public String remoteZookeeperServer(){
        return "network error";
    }



    public List<MoUser> getList(){

        return null;
    }

}
