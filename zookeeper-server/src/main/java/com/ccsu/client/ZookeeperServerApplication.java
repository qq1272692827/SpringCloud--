package com.ccsu.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wenzhenyu
 * @description zookeeper服务端
 * @date 2019/4/1
 */

@SpringBootApplication
@EnableDiscoveryClient
public class ZookeeperServerApplication {

    public static void main(String[] args){

        SpringApplication.run(ZookeeperServerApplication.class,args);

    }

}
