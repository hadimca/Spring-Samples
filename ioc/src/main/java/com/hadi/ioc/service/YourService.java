package com.hadi.ioc.service;

import com.hadi.ioc.model.Department;
import com.hadi.ioc.model.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class YourService {

    @Autowired
    private Shop shop;

    @Autowired
    private Shop getShop;

    public void setNameOne(String str){
        shop.setShopName(str);
    }

    public String getNameOne(){
        return shop.getShopName();
    }

    public void setNameTwo(String str){
        getShop.setShopName(str);
    }

    public String getNameTwo(){
        return getShop.getShopName();
    }

}