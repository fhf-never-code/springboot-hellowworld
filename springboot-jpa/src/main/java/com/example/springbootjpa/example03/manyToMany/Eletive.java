package com.example.springbootjpa.example03.manyToMany;

import com.example.springbootjpa.example03.manyToMany.Student04;
import com.example.springbootjpa.example03.manyToMany.Course04;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
public class Eletive {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  String detail;
    @ManyToOne
    private  Student04 student;
    @ManyToOne
    private  Course04 course;

}
