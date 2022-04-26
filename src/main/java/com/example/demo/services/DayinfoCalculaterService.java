package com.example.demo.services;

public class DayinfoCalculaterService {
    public String getDayinfoByTime(int time){
        if (time > 4 && time <= 11){
            return "morning";
        } else if (time > 11 && time <= 15 ){
            return "afternoon";
        } else if (time > 15 && time <= 21) {
            return "evening";
        } else if (time > 21 && time <= 4 ) {
            return "night";
        } else{
            throw new IllegalArgumentException();
        }
    }
}
