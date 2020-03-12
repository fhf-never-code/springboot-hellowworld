package com.example.springbootjpa.example02.oneToOne;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@SpringBootTest
@Slf4j
@Transactional
@Rollback(value = false)
public class OneToManyTest {
    @Autowired
    private EntityManager manager;//JPA中对数据库增删改查的接口
    @Test
    @DisplayName("OneToMany的查询")
    public void test_OneToMany(){
        User02 user = new User02();
        user.setName("kazei");
        manager.persist(user);

        Addresses02 a1 = new Addresses02();
        a1.setDetail("956");
        manager.persist(a1);

        Addresses02 a2 = new Addresses02();
        a2.setDetail("956");
        manager.persist(a2);
    }
    @Test
    @DisplayName("01")
    public  void test_rel01(){ //从many往one里插入

            User02 user = manager.find(User02.class, 1);
            //由多段进行维护
            Addresses02 a1 = manager.find(Addresses02.class,1 );//自动映射成对象 去Addresses02找主键为1的记录 （找到）
            a1.setUser(user);
            Addresses02 a2 = manager.find(Addresses02.class,2 );
            a2.setUser(user);
    }
    @Test
    @DisplayName("02")
    public  void test_rel02(){ //由被维护方向维护方插入 无效 即one to many

        User02 user = manager.find(User02.class, 1);
        Addresses02 a1 = manager.find(Addresses02.class,1 );
        Addresses02 a2 = manager.find(Addresses02.class,2 );
        user.setAddresses02s(List.of(a1,a2));
        //one to one 仍然需要设计约束 即 mapped by的一方为被维护方 在维护方需要设置@JoinColumn(unique = true)为唯一约束

    }
}
