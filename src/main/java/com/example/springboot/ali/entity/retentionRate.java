package com.example.springboot.ali.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@RequiredArgsConstructor
public class retentionRate {
    /**
     * shop_id : 1
     * watchTime : 1
     * watchUsers : 1
     * retention_rate : 1
     */

    private int shop_id;
    private Date watchTime;
    private int watchUsers;
    private String retention_rate;

//    shop_id | watchTime  | watchUsers | retention_rate |
//            +---------+------------+------------+----------------+
//            |      44 | 2016-10-01 |          2 | 100.0%


    @Override
    public String toString() {
        return "topAvgPay{" +
                ", shop_id='" + shop_id +
                ", watchTime='" + watchTime +
                ", watchUsers='" + watchUsers +
                ", retention_rate=" + retention_rate +
                '}';
    }


    public int getShop_id() {
        return shop_id;
    }

    public void setShop_id(int shop_id) {
        this.shop_id = shop_id;
    }

    public Date getWatchTime() {
        return watchTime;
    }

    public void setWatchTime(Date watchTime) {
        this.watchTime = watchTime;
    }

    public int getWatchUsers() {
        return watchUsers;
    }

    public void setWatchUsers(int watchUsers) {
        this.watchUsers = watchUsers;
    }

    public String getRetention_rate() {
        return retention_rate;
    }

    public void setRetention_rate(String retention_rate) {
        this.retention_rate = retention_rate;
    }
}
