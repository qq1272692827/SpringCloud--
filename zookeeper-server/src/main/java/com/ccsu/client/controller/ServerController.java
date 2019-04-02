package com.ccsu.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wenzhenyu
 * @description
 * @date 2019/4/2
 */
@RestController
public class ServerController {

    @RequestMapping("/test")
    public String test(){

        try {
            Thread.sleep(100000);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "server hello World";
    }

}
