package com.example.springboot.ali.mapper;
import com.example.springboot.ali.entity.topPopIndex;
import com.example.springboot.ali.entity.topshop;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Repository
public interface TopShopMapper {
    List<topshop> getTopShops(Map<String, Object> map);
}
