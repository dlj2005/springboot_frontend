package com.example.springboot.ali.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@ToString
@RequiredArgsConstructor
public class topAvgPay {
    /**
     * shop_id : 1
     * totalPays : 1
     * transDayPerYear : 1
     * AvgPays : 1.11
     */

    private int shopid;
    private int totalPays;
    private int transDayPerYear;
    private double avgPays;

    public int getShopid() {
        return shopid;
    }

    public void setShop_id(int shop_id) {
        this.shopid = shop_id;
    }

    public int getTotalPays() {
        return totalPays;
    }

    public void setTotalPays(int totalPays) {
        this.totalPays = totalPays;
    }

    public int getTransDayPerYear() {
        return transDayPerYear;
    }

    public void setTransDayPerYear(int transDayPerYear) {
        this.transDayPerYear = transDayPerYear;
    }

    public double getAvgPays() {
        return avgPays;
    }

    public void setAvgPays(double AvgPays) {
        this.avgPays = AvgPays;
    }

    @Override
    public String toString() {
        return "topAvgPay{" +
                "shop_id=" + shopid +
                ", totalPays='" + totalPays +
                ", transDayPerYear=" + transDayPerYear +
                ", AvgPays=" + avgPays +
                '}';
    }
}
