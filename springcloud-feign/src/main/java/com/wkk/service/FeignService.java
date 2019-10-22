package com.wkk.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "provider")//服务名,不区分大小写
public interface FeignService {

    @RequestMapping("/testfeign")
    public  String  testFeign(@RequestParam String name);//传入对应参数

}
