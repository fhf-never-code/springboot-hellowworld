package com.example.springbootjpa.example01;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity//定义一个实体类
@Data
@NoArgsConstructor//无参构造函数的注解
public class User {
    @Id
//  @GeneratedValue(strategy =  GenerationType.IDENTITY)//自增长 但是设置完了UUID不需要一个自增长的唯一标识码（主键 所以去掉括号内容）
    @GeneratedValue//通过该注解由Hibernet生成
    @Column(length = 16)
    private UUID id;//生成主键
    private String name;
    private LocalDate birthday;
    @Column(columnDefinition = "timestamp default current_timestamp",
            insertable = false,
            updatable = false)//数据库自动插入一个时间戳 (设定为时间戳 默认 当前时间存入)
    private LocalDateTime insertTime;
    @Column(columnDefinition = "timestamp default current_timestamp "//最后必须有个空格
            +"on update current_timestamp",//按当前时间戳去更新
            insertable = false,
            updatable = false)//数据库自动插入一个时间戳 (设定为时间戳 默认 当前时间存入)
    private  LocalDateTime updateTime;
}
