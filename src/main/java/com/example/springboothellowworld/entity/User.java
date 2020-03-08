package com.example.springboothellowworld.entity;

import lombok.*;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Getter@Setter
@AllArgsConstructor//自动生成带有所有参数（全部属性）的构造函数
@NoArgsConstructor//自动生成无参构造函数
@Data
@Slf4j
public class User {
    private String name;
    public void get(String name) {

        int length = 5;

        if (name.length() <= length) {

            log.debug("当前输入:{},长度小于length",name);

        }else {
            System.out.println("error");
        }

    }
}
