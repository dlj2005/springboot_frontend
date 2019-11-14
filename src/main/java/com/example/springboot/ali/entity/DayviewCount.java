package com.example.springboot.ali.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@ToString
@RequiredArgsConstructor
public class DayviewCount {
    /**
     * shopid : 1
     * viewCounts : 1
     * day : 1
     */

    private int shopid;
    private int viewCounts;
    private String day;
//+---------+------------+-------+
//        | shop_id | viewCounts | day   |
//            +---------+------------+-------+
//            |       1 |         40 | 10-1  |
//            |       1 |         31 | 10-10 |



    @Override
    public String toString() {
        return "searchViewsByShopId{" +
                "shop_id=" + shopid +
                ", viewCounts='" + viewCounts +
                ", day=" + day +
                '}';
    }

    public int getShopid() {
        return shopid;
    }

    public void setShopid(int shopid) {
        this.shopid = shopid;
    }

    public int getViewCounts() {
        return viewCounts;
    }

    public void setViewCounts(int viewCounts) {
        this.viewCounts = viewCounts;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
