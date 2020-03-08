package com.example.springboothellowworld.controllor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MyControllor {
    @GetMapping("/data")
        public Map get(){
            return Map.of("name","y.f.li");
        }
}
