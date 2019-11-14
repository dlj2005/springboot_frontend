package com.example.springboot.ali.mapper;
import com.example.springboot.ali.entity.topPopIndex;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Repository
public interface TopPopMapper {
    List<topPopIndex> getPopList(Map<String, Object> map);
}
