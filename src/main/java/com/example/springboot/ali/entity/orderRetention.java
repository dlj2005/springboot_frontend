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

    private Date begdate;
    private Date enddate;


    @Override
    public String toString() {
        return "topAvgPay{" +
                ", begdate='" + begdate +
                ", enddate='" + enddate +
                '}';
    }

    public Date getBegdate() {
        return begdate;
    }

    public void setBegdate(Date begdate) {
        this.begdate = begdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }
}
