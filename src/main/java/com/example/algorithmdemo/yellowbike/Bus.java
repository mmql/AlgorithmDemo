package com.example.algorithmdemo.yellowbike;

/**
 * @version 1.0
 * @author:wujuan
 * @date 2023/3/11 17:18
 */
public class Bus {

    /**
     * 目的地
     */
    private String targetPosition = "";

    /**
     * 当前位置
     */
    private String nowPosition = "A";

    /**
     * 速度
     */
    private int speed = 3;

    /**
     * 0 待传输，1传输中
     */
    private int status;

    /**
     * 最大装载容量
     */
    private int maxCapacity;

    /**
     * 实际装载容量
     */
    private int actualCapacity;

    private int x;

    private int y;

    public Bus(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public String getTargetPosition() {
        return targetPosition;
    }

    public void setTargetPosition(String targetPosition) {
        this.targetPosition = targetPosition;
    }

    public String getNowPosition() {
        return nowPosition;
    }

    public void setNowPosition(String nowPosition) {
        this.nowPosition = nowPosition;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getActualCapacity() {
        return actualCapacity;
    }

    public void setActualCapacity(int actualCapacity) {
        this.actualCapacity = actualCapacity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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
