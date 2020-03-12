package com.example.springbootjpa.example03.manyToMany;

import com.example.springbootjpa.example03.manyToMany.Eletive;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Student04{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany(mappedBy = "student")
    private List<Eletive> eletives;


}
