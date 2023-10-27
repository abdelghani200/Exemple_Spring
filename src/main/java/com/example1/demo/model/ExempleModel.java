package com.example1.demo.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ExempleModel {

    List<String> names = new ArrayList<>();

    ExempleModel(){
        names.add("1000  YC");
        names.add("jicoco");
        names.add("smsppz");
    }

    public String getnames(){
        return names.get(0);
    }

}
