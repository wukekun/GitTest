package com.wkk.controller;

import com.wkk.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    private FeignService feignService;

    @RequestMapping("/testfeign")
    public  String  test(@RequestParam String name){
        System.out.print("1");
        return  feignService.testFeign(name);
    }

}
