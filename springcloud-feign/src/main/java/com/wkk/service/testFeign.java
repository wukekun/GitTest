package com.wkk.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class testFeign {
    @RequestMapping("/testfeign")
    public String  testFeign(@RequestParam String name){
        return name + 1;
    }

}
