package com.yidian.core.service.impl;

import com.yidian.core.bean.TestJavaBean;
import com.yidian.core.dao.TestDao;
import com.yidian.core.service.TestInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created by Riefu on 2016/4/2.
 */
@Service
public class TestServiceImpl implements TestInterface {

    @Autowired
    private TestDao testDao2;

    @Test
    public void testInsert(TestJavaBean testJavaBean) {

        this.testDao2.testInsert(testJavaBean);
    }

    public TestJavaBean testSelect(int id) {
        return null;
    }

    @Test
    public  void testDemo(){

        System.out.println("Hello,World");
    }
}
