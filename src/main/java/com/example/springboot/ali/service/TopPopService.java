package com.example.springboot.ali.service;

import com.example.springboot.ali.entity.topPopIndex;
import com.example.springboot.ali.mapper.TopPopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class TopPopService {
    @Autowired
    TopPopMapper topPopMapper;

    public List<topPopIndex> getPopList(Map<String, Object> map){
        return topPopMapper.getPopList(map);
    }
}
