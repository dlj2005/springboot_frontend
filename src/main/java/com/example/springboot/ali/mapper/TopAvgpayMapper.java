package com.example.springboot.ali.mapper;
import com.example.springboot.ali.entity.topAvgPay;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TopAvgpayMapper {
    List<topAvgPay> getTopPays();
}
