package com.example.springboot.ali.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@ToString
@RequiredArgsConstructor
public class orderShop {
    private int shopid;
    private String foodname;
    private String cityname;

//             +---------+-----------+------------+---------------------+-----------+---------+-------+--------------------+
//              | shopid | paycounts | payPersons | foodname         | cityname | per_pay | score | AvgPay             |
//            +---------+-----------+------------+---------------------+-----------+---------+-------+--------------------+
//            |     799 |       135 |        117 | 川味/重庆火锅       | 苏州      |      20 |     4 | 23.076923076923077 |
//

    @Override
    public String toString() {
        return "topAvgPay{" +
                ", shopid='" + shopid +
                ", foodname='" + foodname +
                ", cityname=" + cityname +
                '}';
    }


    public int getShopid() {
        return shopid;
    }

    public void setShopid(int shopid) {
        this.shopid = shopid;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }
}
