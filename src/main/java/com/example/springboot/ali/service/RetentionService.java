package com.example.springboot.ali.service;

import com.example.springboot.ali.entity.orderRetention;
import com.example.springboot.ali.entity.retentionRate;
import com.example.springboot.ali.mapper.RetentionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class RetentionService {
    @Autowired
    RetentionMapper retentionMapper;

    public List<retentionRate> getRetentionList(Map<String, Object> map){
        return retentionMapper.getRetentionList(map);
    }
}
