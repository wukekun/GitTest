package com.wkk.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class Controller {

    @Autowired
    private RestTemplate resttemplate;

    @RequestMapping("/consumer")
    public  String helloConsumer(){
        System.out.print("123");

        //这句话是直接打出""号就自动补全来的,花了很长时间  凸(艹皿艹 )!!
        String str = resttemplate.getForEntity("http://PROVIDER/test",String.class).getBody();
        return str;
    }


}
