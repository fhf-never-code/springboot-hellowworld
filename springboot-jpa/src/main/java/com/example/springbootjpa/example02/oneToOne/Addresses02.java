package com.example.springbootjpa.example02.oneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Addresses02 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id ;
    private  String detail;
    @ManyToOne
    private User02 user;
}
