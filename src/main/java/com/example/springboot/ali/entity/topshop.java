package com.example.springboot.ali.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@ToString
@RequiredArgsConstructor
public class topshop {
    /**
     * shopid : 1
     * paycounts : 1
     * payPersons : 1
     * foodname : 1
     * cityname : 1
     * perpay : 1
     * score : 1.1
     * AvgPay : 1.1
     */

    private int shopid;
    private int paycounts;
    private int payPersons;
    private String foodname;
    private String cityname;
    private int perpay;
    private int score;
    private double AvgPay;

//             +---------+-----------+------------+---------------------+-----------+---------+-------+--------------------+
//              | shopid | paycounts | payPersons | foodname         | cityname | perpay | score | AvgPay             |
//            +---------+-----------+------------+---------------------+-----------+---------+-------+--------------------+
//            |     799 |       135 |        117 | 川味/重庆火锅       | 苏州      |      20 |     4 | 23.076923076923077 |
//

    @Override
    public String toString() {
        return "topAvgPay{" +
                ", shopid='" + shopid +
                ", paycounts='" + paycounts +
                ", payPersons='" + payPersons +
                ", foodname='" + foodname +
                ", cityname=" + cityname +
                ", perpay='" + perpay +
                ", score='" + score +
                ", AvgPay=" + AvgPay +
                '}';
    }


    public int getShopid() {
        return shopid;
    }

    public void setShopid(int shopid) {
        this.shopid = shopid;
    }

    public int getPaycounts() {
        return paycounts;
    }

    public void setPaycounts(int paycounts) {
        this.paycounts = paycounts;
    }

    public int getPayPersons() {
        return payPersons;
    }

    public void setPayPersons(int payPersons) {
        this.payPersons = payPersons;
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

    public int getPerpay() {
        return perpay;
    }

    public void setPerpay(int perpay) {
        this.perpay = perpay;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public double getAvgPay() {
        return AvgPay;
    }

    public void setAvgPay(double AvgPay) {
        this.AvgPay = AvgPay;
    }
}
