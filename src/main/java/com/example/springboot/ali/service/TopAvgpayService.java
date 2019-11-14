package com.example.springboot.ali.service;

import com.example.springboot.ali.entity.topAvgPay;
import com.example.springboot.ali.mapper.TopAvgpayMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TopAvgpayService {
    @Autowired
    TopAvgpayMapper topAvgpayMapper;

    public List<topAvgPay> getPayList(){
        return topAvgpayMapper.getTopPays();
    }
}
