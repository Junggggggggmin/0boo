package com.example.demo;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DemoMapper {
    int insDemo(DemoEntity entity);



}
