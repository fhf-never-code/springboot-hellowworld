package com.example.springbootjpa.example02.oneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class User02 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id ;
    private  String name;
    @OneToMany(mappedBy = "user")//放弃对关系的控制 双向关系中必须设置一个mappedBy的意思就是“被映射”，即mappedBy这方不用管关联关系，关联关系交给另一方处理
//1.规律：凡是双向关联，mapped必设，因为根本都没必要在2个表中都存在一个外键关联，在数据库中只要定义一边就可以了
//    a) 只有OneToOne,OneToMany,ManyToMany上才有mappedBy属性，ManyToOne不存在该属性； 
//    b) mappedBy标签一定是定义在the owned side(被拥有方的)，他指向the owning side(拥有方)；
//    c) mappedBy的含义，应该理解为，拥有方能够自动维护 跟被拥有方的关系； 
//               当然，如果从被拥有方，通过手工强行来维护拥有方的关系也是可以做到的。
       private List<Addresses02> addresses02s;

}
