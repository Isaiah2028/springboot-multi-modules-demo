package com.luyuan.modules.web01.troller;

import com.luyuan.modules.services.TestService;
import com.luyuan.modules.services.impl.TestServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author: IsaiahLu
 * @date: 2023/2/24 16:17
 */
@RestController
public class HelloWeb01Controller {

    @RequestMapping(path = "/hello1", method = RequestMethod.POST)
    public String test() {

        TestService testService = new TestServiceImpl();
        testService.testServiceFunction();

        System.out.println("你好，吴思思！");
        return "hello, wusisi...";
    }


}
