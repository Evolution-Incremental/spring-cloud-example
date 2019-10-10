package com.example.springcloudclient.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * ClassName:
 * Description:
 * date: 2019/9/12 0012 14:07
 *
 * @author SS
 * @since JDK 1.8
 */


@FeignClient("spring-cloud-client")
public interface FeignClientUtil {

    @RequestMapping(method = RequestMethod.GET,value = "/user/Comtroller/getUserModel")
    Map<String, String> getUserModel(@RequestParam(value = "id")Integer id);

    //@Headers({"Content-Type: application/json","Accept: application/json"})
    //@RequestLine("POST /user/Comtroller/getUserModelByPost")
    @RequestMapping(method = RequestMethod.POST,value = "/user/Comtroller/getUserModelByPost")
    Map<String, String> getUserModelByPost(Integer id);

}
