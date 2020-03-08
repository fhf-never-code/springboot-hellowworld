package com.example.springboothellowworld.service;

import com.example.springboothellowworld.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLOutput;
import java.util.List;

@SpringBootTest // 可以直接注入Springboot的测试模拟
@Slf4j
public class UserServiceTest {
    @Autowired //调用可直接调用组件的一部分
    private UserService userService;//调用一个类 因为调用导致它的级别和你一样 提高到debug以上即可打印
//    Logger logger = LoggerFactory.getLogger(UserService.class);//基于slf接口创建了一个日志对象
    @Test
    @DisplayName("测试日志对象的测试方法")
    public void test_logging1(){
        String str = "一个变量";
//        logger.debug("日志对象输出{}{}{}",str,str,str);//会自动拼接字符串 但是因为等级不够debug而不会执行这个方法 但是字符串早就拼完了
                                            //利用一个模板占位符类似JS 不会自动拼接字符串
        log.debug("lombok组件自动生成{}", str);
    }
    @Test
    @DisplayName("测试User类")
    public void test_user(){
        User user = new User("y.f.li");
        log.debug(user.getName());

        log.debug(user.toString());
    }
    @Test
    @DisplayName("输入1+1，预期为3")
    public void test_add(){
        System.out.println("success");
        Assertions.assertEquals(2, userService.add(1, 2)); //使用类中实例级的方法 没有new 空指针
    }
    @Test
    public void test_addsting(){
        Assertions.assertThrows(Exception.class,() ->{
            userService.addString("风红枫");
            System.out.println(userService);
        });//预期出现异常
    }


}
