package com.example.algorithmdemo.yellowbike;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @author:wujuan
 * @date 2023/3/11 18:19
 */
public class BusFactory {

    public static List<Bus> getBuses(){
        Bus bus1=new Bus(20);
        Bus bus2=new Bus(20);

        List<Bus> buss = new ArrayList<>();
        buss.add(bus1);
        buss.add(bus2);
        return buss;
    }
}
