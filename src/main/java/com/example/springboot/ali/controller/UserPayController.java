package com.example.springboot.ali.controller;

import com.example.springboot.ali.entity.*;
import com.example.springboot.ali.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import javax.validation.Valid;
import java.text.ParseException;
import java.util.*;
import java.util.function.Consumer;



@Controller
public class UserPayController {

    @Autowired
    private TopAvgpayService topAvgpayService;
    @Autowired
    private TopPopService topPopService;
    @Autowired
    RetentionService retentionService;
    @Autowired
    ViewService viewService;
    @Autowired
    TopShopService topShopService;

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

    @RequestMapping(value = "/echartjob1.action")
    @ResponseBody
    public List<topAvgPay> getJob1Entity() {
        return topAvgpayService.getPayList();
    }

    @GetMapping(value = "/templates/echart/job1.do")
    public String echarts4(Model model){
        System.err.println("========开始");
        return "Echars";
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

    @RequestMapping(value = "/job3.1")
    public ModelAndView getPaylist(@Valid orderRetention order, BindingResult result){

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("pay/job3.1");

        return modelAndView;
    }

    @PostMapping(value = "/search.action")
    public ModelAndView retentionindex(@Valid orderRetention order, BindingResult result) throws ParseException {

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

        modelAndView.setViewName("pay/job3.1");

        return modelAndView;
    }

    @RequestMapping(value = "/job3.2")
    public ModelAndView getViewList(@Valid orderView order, BindingResult result){

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("pay/job3.2");

        return modelAndView;
    }

    @PostMapping(value = "/searchView.action")
    public ModelAndView viewindex(@Valid orderView order,BindingResult result) throws ParseException {

        ModelAndView modelAndView = new ModelAndView();


        if(result.hasErrors()){
            modelAndView.addObject("hintMessage","出错啦！");
        }else{
            Map<String, Object> map = new HashMap<>();
            if(order.getShopid() != 0){
                map.put("shopid",order.getShopid());
            }
            String timeDim = order.getTimeDimention();
            if(timeDim!=null){
                List<DayviewCount> viewCountList = viewService.getViewList(map,timeDim);
                modelAndView.addObject("viewCountList",viewCountList );
            }
            System.out.println("map params:"+map.toString());
        }

        modelAndView.setViewName("pay/job3.2");

        return modelAndView;
    }

    @RequestMapping(value = "/job3.3")
    public ModelAndView getTopShopView(@Valid orderShop order, BindingResult result){

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("pay/job3.3");

        return modelAndView;
    }

    @PostMapping(value = "/TopShopView.action")
    public ModelAndView TopShopindex(@Valid orderShop order,BindingResult result) throws ParseException {

        ModelAndView modelAndView = new ModelAndView();
        System.out.println(order.toString());

        if(result.hasErrors()){
            modelAndView.addObject("hintMessage","出错啦！");
        }else{
            Map<String, Object> map = new HashMap<>();
            if(order.getShopid() != 0){
                map.put("shopid",order.getShopid());
            }
            if(order.getCityname()!=null){
                map.put("cityname",order.getCityname());
            }
            if(order.getFoodname()!=null){
                map.put("foodname",order.getFoodname());
            }
            List<topshop> viewCountList = topShopService.getTopShopViewList(map);
            modelAndView.addObject("viewCountList",viewCountList );
            System.out.println("map params:"+map.toString());
        }

        modelAndView.setViewName("pay/job3.3");

        return modelAndView;
    }



}
