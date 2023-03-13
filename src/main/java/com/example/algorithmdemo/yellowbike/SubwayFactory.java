package com.example.algorithmdemo.yellowbike;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @author:wujuan
 * @date 2023/3/11 17:09
 */
public class SubwayFactory {


    public static List<Subway> getSubways(){
        Subway A=new Subway(30,"A",1,1);
        Subway B=new Subway(40,"B",4,3);
        Subway C=new Subway(30,"C",8,8);

        List<Subway> subways = new ArrayList<>();
        subways.add(A);
        subways.add(B);
        subways.add(C);
        return subways;
    }

}
