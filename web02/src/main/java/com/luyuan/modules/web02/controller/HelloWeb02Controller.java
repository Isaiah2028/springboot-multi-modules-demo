package com.luyuan.modules.web02.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: IsaiahLu
 * @date: 2023/2/24 16:17
 */
@RestController
public class HelloWeb02Controller {
    @RequestMapping(path = "/hello2", method = RequestMethod.POST)
    public String test() {
        System.out.println("你好，吴思思！222222");
        return "hello, wusisi...2222222";
    }

}
