package com.example.springcloudclient.eurekaClientExample;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName:
 * Description:
 * date: 2019/9/11 0011 9:59
 *
 * @author SS
 * @since JDK 1.8
 */
@RestController
public class SpringCloudEurekaClient {


    @Autowired
    private DiscoveryClient discoveryClient;
    @Value("${server.port}")
    private String port;
    @RequestMapping("/hi")
    public String serviceUrl() {
        List<ServiceInstance> list = discoveryClient
                .getInstances("spring-cloud-service");
        if (list != null && list.size() > 0) {
            return String.valueOf(list.get(0).getUri());
        }
        return null;
    }
    @GetMapping("/sc/user/{id}")
    public String findByIdByEurekaServer(@PathVariable Long id) {
        /*String providerServiceUrl = serviceUrl();
        return this.restTemplate.getForObject(providerServiceUrl + "eurekaOrder//UserModel/" + id,
                UserModel.class);*/
        String s = serviceUrl();
        return s;
    }

}
