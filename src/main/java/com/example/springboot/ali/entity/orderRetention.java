package com.example.springboot.ali.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@RequiredArgsConstructor
public class orderRetention {
    /**
     * begdate : 1
     * enddate : 2
     */

    private String begdate;
    private String enddate;


    @Override
    public String toString() {
        return "topAvgPay{" +
                ", begdate='" + begdate +
                ", enddate='" + enddate +
                '}';
    }

    public String getBegdate() {
        return begdate;
    }

    public void setBegdate(String begdate) {
        this.begdate = begdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }
}
