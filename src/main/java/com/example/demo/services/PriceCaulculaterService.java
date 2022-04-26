package com.example.demo.services;

public class PriceCaulculaterService {
    public int getPriceByAge(int age){
        //invalid input
        if (age < 0) {
            throw new IllegalArgumentException();
        } else if (age < 6){
           return 0;
        } else if (age >= 18 && age < 64){
            return 20;
        } else {
            return 10;
        }
    }
}
