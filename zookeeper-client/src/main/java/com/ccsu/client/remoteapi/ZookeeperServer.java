package com.ccsu.client.remoteapi;

import com.ccsu.client.domain.MoUser;
import com.ccsu.client.remoteapi.impl.ZookeeperServerIMPL;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@FeignClient(name="server-test" ,fallback = ZookeeperServerIMPL.class)
public interface ZookeeperServer {


    @GetMapping(value = "/test")
    public String remoteZookeeperServer();

    @GetMapping("/list")
    List<MoUser> getList();

}
