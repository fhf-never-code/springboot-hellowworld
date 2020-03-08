package com.example.springboothellowworld.entity;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;
@Slf4j
@SpringBootTest
class homework2Test {
    String str = "fhf";
    String str1 = "我的网名叫风红枫";
    @Test
    @DisplayName("一，测试文件大小为1kb，实为27kb")
    public void testhomework2_getSize(){
        Assertions.assertEquals(1, homework2.getSize(Paths.get("E:\\.idea\\testfile.txt")));
    }
    @Test
    @DisplayName("二，测试文件大小为27kb，实为1kb")
    public void testhomework2_getSize1(){
        Assertions.assertEquals(27,homework2.getSize((Path.of("E:\\.idea\\testfile.txt"))));
    }
    @Test
    @DisplayName("三，测试文件路径不正确，抛出异常")
    public void testhomework2_getSize2(){
        Assertions.assertEquals(27,homework2.getSize((Path.of("E:/testfile.txt"))));
    }

    User user =new User("hhhhh");
    @Test
    @DisplayName("四，测试log.debug的输出")
    public void test_get() {

          user.get(user.getName());
//        log.debug(user.getName());
//        log.debug(user.get(user.get(user.);))
        }
    }


