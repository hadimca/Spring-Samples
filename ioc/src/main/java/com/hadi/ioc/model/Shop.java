package com.hadi.ioc.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Shop {
    private String name;

    @Bean
    public Shop getShop(){

        return new Shop();
    }

    public void setShopName(String str){
        name = str;
    }

    public String getShopName(){
        return  name;
    }

}

