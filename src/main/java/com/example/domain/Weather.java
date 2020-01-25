package com.example.domain;

import java.util.Date;

public class Weather {
    private String name;
    private double temp;
    private int humidity;
    private Date actualTime;

    public Weather(String name, double temp, int humidity, Date actualTime) {
        this.name = name;
        this.temp = temp;
        this.humidity = humidity;
        this.actualTime = actualTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public Date getActualTime() {
        return actualTime;
    }

    public void setActualTime(Date actualTime) {
        this.actualTime = actualTime;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "name='" + name + '\'' +
                ", temp=" + temp +
                ", humidity=" + humidity +
                ", actualTime=" + actualTime +
                '}';
    }
}
