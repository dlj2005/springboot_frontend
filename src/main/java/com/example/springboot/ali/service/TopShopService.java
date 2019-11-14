package com.example.springboot.ali.service;

import com.example.springboot.ali.entity.topAvgPay;
import com.example.springboot.ali.entity.topshop;
import com.example.springboot.ali.mapper.TopAvgpayMapper;
import com.example.springboot.ali.mapper.TopShopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class TopShopService {
    @Autowired
    TopShopMapper topShopMapper;

    public List<topshop> getTopShopViewList(Map<String, Object> map){
        return topShopMapper.getTopShops(map);
    }
}
