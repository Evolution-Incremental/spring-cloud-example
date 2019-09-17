package com.example.springcloudclient.eurekaClientExample;


import com.example.springcloudclient.util.FeignClientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * ClassName:
 * Description:
 * date: 2019/9/11 0011 9:59
 *
 * @author SS
 * @since JDK 1.8
 */
@RestController
public class SpringCloudEurekaCuntomController {

    @Autowired
    FeignClientUtil feignClientUtil;

    @RequestMapping(value = "/getUserModel",method = RequestMethod.GET)
    public Map getUserModel(){
        Map<String, String> userModel = feignClientUtil.getUserModel(1);
        return userModel;
    }
    @RequestMapping(value = "/getUserModelByPost",method = RequestMethod.POST)
    public Map getUserModelByPost(){
        Map<String, String> userModel = feignClientUtil.getUserModelByPost(1);
        return userModel;
    }


}
