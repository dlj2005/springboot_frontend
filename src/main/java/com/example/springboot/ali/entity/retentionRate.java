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
     * shopId : 1
     * watchTime : 1
     * watchUsers : 1
     * retentionRate : 1
     */

    private int shopId;
    private String watchTime;
    private int watchUsers;
    private String retentionRate;

//    shopId | watchTime  | watchUsers | retentionRate |
//            +---------+------------+------------+----------------+
//            |      44 | 2016-10-01 |          2 | 100.0%


    @Override
    public String toString() {
        return "retentionRate{" +
                " shopId=" + shopId +
                ", watchTime=" + watchTime +
                ", watchUsers=" + watchUsers +
                ", retentionRate=" + retentionRate +
                '}';
    }


    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getWatchTime() {
        return watchTime;
    }

    public void setWatchTime(String watchTime) {
        this.watchTime = watchTime;
    }

    public int getWatchUsers() {
        return watchUsers;
    }

    public void setWatchUsers(int watchUsers) {
        this.watchUsers = watchUsers;
    }

    public String getRetentionRate() {
        return retentionRate;
    }

    public void setRetentionRate(String retentionRate) {
        this.retentionRate = retentionRate;
    }
}
