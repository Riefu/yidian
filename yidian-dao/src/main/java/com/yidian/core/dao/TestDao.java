package com.yidian.core.dao;

import com.yidian.core.bean.TestJavaBean;

/**
 * Created by Riefu on 2016/4/2.
 */
public interface TestDao {

    public  void testInsert(TestJavaBean testJavaBean);

    public  TestJavaBean testSelect(int id);
}
