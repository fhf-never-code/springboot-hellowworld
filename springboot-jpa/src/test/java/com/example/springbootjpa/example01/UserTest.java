package com.example.springbootjpa.example01;

import com.example.springbootjpa.example01.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import java.time.LocalDate;

@Slf4j
@SpringBootTest
@Transactional//事务 往数据库里的操作所使用的的注解
@Rollback(value = false)//关闭回滚 插入的数据测试结束会自动删除
class UserTest {
    @Autowired//自动注入持久化管理器
    private EntityManager manager;
    @Test
    public  void test_addUser(){
        User user = new User();
        user.setBirthday(LocalDate.of(1990, 8, 8));
        user.setName("l.f.li");
        manager.persist(user);//把user塞进数据库
        log.debug("{}",user.getId());
    }
}