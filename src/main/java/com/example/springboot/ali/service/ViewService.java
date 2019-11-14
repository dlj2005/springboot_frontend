package com.example.springboot.ali.service;

import com.example.springboot.ali.entity.DayviewCount;
import com.example.springboot.ali.mapper.ViewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class ViewService {
    @Autowired
    ViewMapper viewMapper;

    public List<DayviewCount> getViewList(Map<String, Object> map, String timeDim){

        if(timeDim.trim().equals("日")){
        return viewMapper.getDayViewList(map);
        }else if (timeDim.trim().equals("周")){
            return viewMapper.getWeekViewList(map);
        }else {
            return  viewMapper.getMonthViewList(map);
        }
    }
}
