package com.example.springboot.ali.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@ToString
@RequiredArgsConstructor
public class topPopIndex {
    /**
     * shopid : 1
     * cityname : 1
     * foodname : 1
     * popInex : 1.1
     */
//    +---------+-----------+-------------+---------+
//            | shop_id | city_name | cate_3_name | popInex |
//            +---------+-----------+-------------+---------+
//            |     752 | 深圳      | 奶茶        |     0.6 |
//            |     144 | 上海      | 奶茶        |     0.6 |


    private int shopid;
    private String cityname;
    private String foodname;
    private double popInex;

    public int getShopid() {
        return shopid;
    }

    public void setShopid(int shopid) {
        this.shopid = shopid;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public double getPopInex() {
        return popInex;
    }

    public void setPopInex(double popInex) {
        this.popInex = popInex;
    }
    @Override
    public String toString() {
        return "topAvgPay{" +
                "shop_id=" + shopid +
                ", cityname='" + cityname +
                ", foodname=" + foodname +
                ", popInex=" + popInex +
                '}';
    }
}
