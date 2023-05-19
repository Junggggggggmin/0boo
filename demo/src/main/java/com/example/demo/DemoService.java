package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    private final DemoMapper mapper;

    @Autowired
    public DemoService(DemoMapper mapper) {this.mapper = mapper;}

    public int insDemo (DemoEntity entity) {
        System.out.println("service-insDemo");

        return mapper.insDemo(entity);
    }
}
