package com.example.algorithmdemo.yellowbike;

/**
 * @version 1.0
 * @author:wujuan
 * @date 2023/3/11 17:13
 */
public class Subway {

    //容量
    private int capacity;

    //线路
    private String line;

    //0没有车传输，1有bus正运载小黄车过来
    private int vanTransFlag;

    private int x;

    private int y;

    public Subway() {
    }

    public Subway(int capacity, String line, int x, int y) {
        this.capacity = capacity;
        this.line = line;
        this.x = x;
        this.y = y;
    }

    public int getVanTransFlag() {
        return vanTransFlag;
    }

    public void setVanTransFlag(int vanTransFlag) {
        this.vanTransFlag = vanTransFlag;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
