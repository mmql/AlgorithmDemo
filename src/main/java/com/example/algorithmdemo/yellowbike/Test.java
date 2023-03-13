package com.example.algorithmdemo.yellowbike;

import org.springframework.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @version 1.0
 * @author:wujuan
 * @date 2023/3/11 17:06
 */
public class Test {
    private static int vanIdleNum =2;

    private static List<Subway> subways = SubwayFactory.getSubways();

    private static List<Bus> idleBuses = BusFactory.getBuses();

    private static List<Bus> useBuses = new ArrayList<>();


    private static List<Integer> peopleTimeCache = new LinkedList<>();

    private static volatile int time = 200;

    static Random random= new Random();

    public static void main(String[] args) {

        new Thread(()->peopleStart()).start();
        new Thread(()->peopleEnd()).start();
        new Thread(()->vanRun()).start();
        new Thread(()->vanLoad()).start();
        new Thread(()->vanUnload()).start();
    }

    private static void peopleStart() {
        for (; ; ) {
            try {
                while (time >= 0) {
                    time --;
                    // 随机选择一个出发车站
                    int startStation = random.nextInt(2);
                    Subway startSubway = subways.get(startStation);
                    startSubway.setCapacity(startSubway.getCapacity()-1);

                    // 随机选择一个要去的车站
                    int endStation = random.nextInt(2);
                    Subway endSubway = subways.get(endStation);

                    int spendTime = Math.abs(endSubway.getX()-startSubway.getX())
                                    +Math.abs(endSubway.getY() - startSubway.getY());
                    // 缓存路人花费的时间
                    peopleTimeCache.add(spendTime);
                    peopleTimeCache.stream().map(x->x=Integer.max(x-1,0)).collect(Collectors.toList());


                    Thread.currentThread().wait(1000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static void peopleEnd() {
        for (; ; ) {
            Iterator<Integer> iterator = peopleTimeCache.iterator();
            while (iterator.hasNext()){
                Integer next = iterator.next();
                if (next == 0){
                    iterator.remove();
                    // 到站了，相关站点的车子需要加一
                }
            }
        }
    }

    private static void vanRun() {
        for (; ; ) {
            while (vanIdleNum > 0) {
                int endStation = random.nextInt(2);
                Subway endSubway = subways.get(endStation);
                if (endSubway.getVanTransFlag() == 1) {
                    //已有小黄车运过来
                    break;
                }


//                if (StringUtils.pathEquals(endSubway.getLine(), )) {

//
//                    vanIdleNum--;
//                }
            }
        }
    }


    private static void vanLoad() {
        for (; ; ) {
            while (vanIdleNum > 0) {
                int endStation = random.nextInt(2);
                Subway endSubway = subways.get(endStation);
                if (endSubway.getVanTransFlag() == 1) {
                    //已有小黄车运过来
                    break;
                }


//                if (StringUtils.pathEquals(endSubway.getLine(), )) {


//                    vanIdleNum--;
//                }
            }
        }
    }

    private static void vanUnload(){
        for(;;){

            for(int i = 0; i< idleBuses.size(); i++){
                for(int j=0;j<subways.size();j++){
                    if(idleBuses.get(i).getX() == subways.get(j).getX() && idleBuses.get(i).getY() == subways.get(j).getY()){
                        idleBuses.get(i).setStatus(0);
                        idleBuses.get(i).setNowPosition(subways.get(j).getLine());
                        int num = subways.get(j).getCapacity()+ idleBuses.get(i).getActualCapacity();
                        subways.get(j).setCapacity(num);
                    }
                    break;
                }
            }

        }
    }

    private static void personTrans(){

    }

}
