package com.luyuan.modules.services.impl;

import com.luyuan.dao.TestDao;
import com.luyuan.modules.services.TestService;
import com.luyuan.modules.utils.TestUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: IsaiahLu
 * @date: 2023/2/24 16:39
 */
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    /**
     * 测试service方法
     */
    @Override
    public void testServiceFunction() {
//        testDao.testDaoFunction();
        //service业务逻辑
        System.out.println("我是 service 中的方法，我处理service业务逻辑.......");
        TestUtils.testUtils();
    }
}
