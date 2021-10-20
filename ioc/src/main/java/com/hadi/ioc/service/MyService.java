package com.hadi.ioc.service;

import com.hadi.ioc.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    @Autowired
    private Department department;

    public void setDep(String str){
        department.setDeptName(str);
    }

    public String getDep(){
        return department.getDeptName();
    }

}
