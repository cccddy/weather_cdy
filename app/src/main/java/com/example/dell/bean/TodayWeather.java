package com.example.dell.bean;


public class TodayWeather {
    private String city;
    private String updatetime;
    private String wendu;
    private String shidu;
    private String pm25;
    private String quality;
    private String fengxiang;
    private String fengli;
    private String date;
    private String high;
    private String low;
    private String type;

    public String getCity(){
        return city;
    }

    public String getUpdatetime(){
        return updatetime;
    }

    public String getWendu(){
        return wendu;
    }

    public String getShidu(){
        return shidu;
    }

    public String getPm25(){
        return pm25;
    }

    public String getQuality(){
        return quality;
    }

    public String getFengxiang(){
        return fengxiang;
    }

    public String getFengli(){
        return fengli;
    }

    public void setDate(String date){
        this.date=date;
    }

    public void setHigh(String high){
        this.high=high;
    }

    public void setLow(String low){
        this.low=low;
    }

    public void setType(String type){
        this.type=type;
    }

    @Override
    public String toString(){
        return "TodayWeather{" +
                "city=' " + city + '\'' +
                ", updatatime=' " + updatetime + '\'' +
                ", wendu=' " + wendu + '\'' +
                ", shidu=' " + shidu + '\'' +
                ", pm25=' " + pm25 + '\'' +
                ", quality=' " + quality + '\'' +
                ", fengxiang=' " + fengxiang + '\'' +
                ", fengli=' " + fengli + '\'' +
                ", date=' " + date + '\'' +
                ", high=' " + high + '\'' +
                ", low=' " + low + '\'' +
                ", type=' " + type + '\'' +
                '}';
    }
}