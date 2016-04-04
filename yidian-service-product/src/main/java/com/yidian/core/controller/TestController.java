package com.yidian.core.controller;

import com.yidian.core.bean.TestJavaBean;
import com.yidian.core.service.TestInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * Created by Riefu on 2016/4/2.
 */
@Controller
public class TestController {

    @Autowired
    private TestInterface testInterface;

    @RequestMapping(value = "/test/test.do")
    public String index(){

            return "index";
    }

    @RequestMapping(value = "test/insert.do")
   public String insert(Model model){

        TestJavaBean user=new TestJavaBean();
        user.setName("Lyxx");
        user.setBirthday(new Date());
        this.testInterface.testInsert(user);
        //model.addAttribute("user",user);
        return "index";
   }

    @RequestMapping(value = "test/user.do")
    public String select    (Model model){

        TestJavaBean user=this.testInterface.testSelect(6);
        model.addAttribute("user",user);
        return "user";
    }
}
