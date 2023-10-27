package com.example1.demo.services;

import com.example1.demo.model.ExempleModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ExempleService {

    @Autowired
    private ExempleModel exempleModel;







    public String printName(String name){
        return exempleModel.getnames().toUpperCase();
    }





}
