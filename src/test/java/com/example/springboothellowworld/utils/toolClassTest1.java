package com.example.springboothellowworld.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class toolClassTest1 {
    @Test
    @DisplayName("x+y+1,输入1+1，预期2")
    public void add(){
        System.out.println("这是第一个测试方法");
        Assertions.assertEquals(4, toolClass.add(1, 2));
    }
    @Test
    @DisplayName("x+y+1,输入1+1，预期3")
    public  void add2(){

        Assertions.assertEquals(3, toolClass.add(1, 2));
    }
}