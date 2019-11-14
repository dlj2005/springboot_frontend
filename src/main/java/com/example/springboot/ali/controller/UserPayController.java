package com.example.springboot.ali.controller;

import com.example.springboot.ali.entity.*;
import com.example.springboot.ali.service.RetentionService;
import com.example.springboot.ali.service.TopAvgpayService;
import com.example.springboot.ali.service.TopPopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;



@Controller
public class UserPayController {

    @Autowired
    private TopAvgpayService topAvgpayService;
    @Autowired
    private TopPopService topPopService;
    @Autowired
    RetentionService retentionService;

    @RequestMapping(value = "/job2")
    public ModelAndView getPaylist(@Valid orderPop pop, BindingResult result){

        ModelAndView modelAndView = new ModelAndView();


        modelAndView.setViewName("pay/job2");

        return modelAndView;
    }

        @RequestMapping(value = "/job1")
    public ModelAndView getTopPays(@Valid topAvgPay topAvgPay, BindingResult result){

        ModelAndView modelAndView = new ModelAndView();

        List<com.example.springboot.ali.entity.topAvgPay> payList = topAvgpayService.getPayList();

        modelAndView.addObject("payList", payList);

        modelAndView.setViewName("pay/job1");

        return modelAndView;
    }


    @PostMapping(value = "/popindex.action")
    public ModelAndView popindex(@Valid orderPop pop, BindingResult result){

        ModelAndView modelAndView = new ModelAndView();

        if(result.hasErrors()){
            modelAndView.addObject("hintMessage","出错啦！");
        }else{
            Map<String, Object> map = new HashMap<>();
            if(pop.getCityname1() != null && pop.getCityname1().length()>0){
                map.put("cityNameone",pop.getCityname1());
            }

            if(pop.getCityname2() != null && pop.getCityname2().length()>0){
                map.put("cityNametwo",pop.getCityname2());
            }

            if(pop.getCityname3() != null && pop.getCityname3().length()>0){
                map.put("cityNamethree",pop.getCityname3());
            }

            if(pop.getCityname4() != null && pop.getCityname4().length()>0){
                map.put("cityNamefour",pop.getCityname4());
            }


            if(pop.getFoodname()!=null && pop.getFoodname().length()>0){
                map.put("foodName",pop.getFoodname());
            }

            System.out.println("map params:"+map.toString());
            List<topPopIndex> popList = topPopService.getPopList(map);
            popList.iterator().forEachRemaining(new Consumer<topPopIndex>() {
                @Override
                public void accept(topPopIndex topPopIndex) {
                    System.out.println(topPopIndex.toString());
                }
            });
            modelAndView.addObject("popList", popList);
        }

        modelAndView.setViewName("pay/job2");

        return modelAndView;
    }

    @RequestMapping(value = "/job3")
    public ModelAndView getPaylist(@Valid orderRetention order, BindingResult result){

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("pay/job3");

        return modelAndView;
    }

    @PostMapping(value = "/search.action")
    public ModelAndView retentionindex(@Valid orderRetention order, BindingResult result){

        ModelAndView modelAndView = new ModelAndView();

        if(result.hasErrors()){
            modelAndView.addObject("hintMessage","出错啦！");
        }else{
            Map<String, Object> map = new HashMap<>();
            if(order.getBegdate() != null){
                map.put("begdate",order.getBegdate());
            }
            if(order.getEnddate() != null){
                map.put("enddate",order.getEnddate());
            }

            System.out.println("map params:"+map.toString());
            List<retentionRate> retentionList = retentionService.getRetentionList(map);
            retentionList.iterator().forEachRemaining(new Consumer<retentionRate>() {
                @Override
                public void accept(retentionRate r) {
                    System.out.println(r.toString());
                }
            });

            modelAndView.addObject("retentionList", retentionList);
        }

        modelAndView.setViewName("pay/job3");

        return modelAndView;
    }



}
