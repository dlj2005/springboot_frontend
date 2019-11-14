package com.example.springboot.ali.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@ToString
@RequiredArgsConstructor
public class orderPop {

    private String cityname1;
    private String cityname2;
    private String cityname3;
    private String cityname4;
    private String foodname;

    @Override
    public String toString() {
        return "topAvgPay{" +
                ", cityname1='" + cityname1 +
                ", cityname2='" + cityname2 +
                ", cityname3='" + cityname3 +
                ", cityname4='" + cityname4 +
                ", foodname=" + foodname +
                '}';
    }

    public String getCityname1() {
        return cityname1;
    }

    public void setCityname1(String cityname1) {
        this.cityname1 = cityname1;
    }

    public String getCityname2() {
        return cityname2;
    }

    public void setCityname2(String cityname2) {
        this.cityname2 = cityname2;
    }

    public String getCityname3() {
        return cityname3;
    }

    public void setCityname3(String cityname3) {
        this.cityname3 = cityname3;
    }

    public String getCityname4() {
        return cityname4;
    }

    public void setCityname4(String cityname4) {
        this.cityname4 = cityname4;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }
}
