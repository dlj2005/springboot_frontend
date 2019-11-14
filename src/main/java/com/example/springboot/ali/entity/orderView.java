package com.example.springboot.ali.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@ToString
@RequiredArgsConstructor
public class orderView {


    private int shopid;
    private String timeDimention;

//+---------+------------+-------+
//        | shop_id | viewCounts | day   |
//            +---------+------------+-------+
//            |       1 |         40 | 10-1  |
//            |       1 |         31 | 10-10 |



    @Override
    public String toString() {
        return "searchViewsByShopId{" +
                "shop_id=" + shopid +
                "timeDimention=" + timeDimention +
                '}';
    }

    public int getShopid() {
        return shopid;
    }

    public void setShopid(int shopid) {
        this.shopid = shopid;
    }

    public String getTimeDimention() {
        return timeDimention;
    }

    public void setTimeDimention(String timeDimention) {
        this.timeDimention = timeDimention;
    }


}
