package com.example.springboot.ali.mapper;
import com.example.springboot.ali.entity.orderRetention;
import com.example.springboot.ali.entity.retentionRate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Repository
public interface RetentionMapper {
    List<retentionRate> getRetentionList(Map<String, Object> map);
}
