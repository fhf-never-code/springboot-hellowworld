package com.example.springboothellowworld.service;

import org.springframework.stereotype.Service;

import java.util.List;
@Service //声明为springboot的一个组件
public class UserService {
    public int add(int x, int y) {
        return x * y;
    }
    public void addString(String str){
        List.of("df").add(str);  //向固定长度集合内添加 异常
    }

}
