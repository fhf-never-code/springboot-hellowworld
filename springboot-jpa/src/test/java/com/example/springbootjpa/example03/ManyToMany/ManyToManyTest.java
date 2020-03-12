package com.example.springbootjpa.example03.ManyToMany;

import com.example.springbootjpa.example03.manyToMany.Student04;
import com.example.springbootjpa.example03.manyToMany.Student04;
import com.example.springbootjpa.example03.manyToMany.Course04;
import com.example.springbootjpa.example03.manyToMany.Eletive;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.lang.model.element.Element;
import javax.persistence.EntityManager;
import java.util.List;

@SpringBootTest
@Slf4j
@Transactional
@Rollback(value = false)
public class ManyToManyTest {
    @Autowired
    private EntityManager manager;//JPA中对数据库增删改查的接口
    @Test
    @DisplayName("OneToMany的查询")
    public void test_ManyToMany(){
    //初始学生1
        Student04 s1 = new Student04();
        s1.setName("hw");
        manager.persist(s1);//创建一个Students1 并保存到Student04表里

        Student04 s2 = new Student04();
        s2.setName("gg");
        manager.persist(s2);

        Course04 course04 = new Course04();
        course04.setName("web框架");
        manager.persist(course04);
}
@Test
    public void test_rel(){
        //ID为1的学生选择了ID为1的课
    Student04 student04 = manager.find(Student04.class,3 );
    Course04 course05 = manager.find(Course04.class, 2);
    Eletive eletive = new Eletive();
    eletive.setDetail("set course2");
    eletive.setCourse(course05);
    eletive.setStudent(student04);
    manager.persist(eletive);//持久化进去

}
}

