package com.ccsu.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
//import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author wenzhenyu
 * @description zookeeper服务端
 * @date 2019/4/1
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ZookeeperClientApplication {

    public static void main(String[] args){

        SpringApplication.run(ZookeeperClientApplication.class,args);

    }

}
