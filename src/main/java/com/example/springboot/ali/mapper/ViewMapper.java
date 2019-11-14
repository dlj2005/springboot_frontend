package com.example.springboot.ali.mapper;
import com.example.springboot.ali.entity.DayviewCount;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Repository
public interface ViewMapper {
    List<DayviewCount> getViewList(Map<String, Object> map, String timeDim);
    List<DayviewCount> getDayViewList(Map<String, Object> map);
    List<DayviewCount> getWeekViewList(Map<String, Object> map);
    List<DayviewCount> getMonthViewList(Map<String, Object> map);
}
