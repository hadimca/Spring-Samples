package com.hadi.ioc.controller;

import com.hadi.ioc.service.MyService;
import com.hadi.ioc.service.YourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {


    @Autowired
    private MyService myService;

    @Autowired
    private YourService yourService;

    @RequestMapping("/component")
    String one() {
        myService.setDep("component");
        return myService.getDep();
    }

    @RequestMapping("/bean_one")
    String bean_one() {
        yourService.setNameOne("bean_one");
        return yourService.getNameOne();
    }

    @RequestMapping("/bean_two")
    String bean_two() {
        yourService.setNameTwo("bean_two");
        return yourService.getNameTwo();
    }

}