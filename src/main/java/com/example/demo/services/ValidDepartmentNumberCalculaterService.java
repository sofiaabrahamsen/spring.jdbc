package com.example.demo.services;

public class ValidDepartmentNumberCalculaterService {
    public boolean isValidDepartmentDivisible(int departmentNumber){
        boolean isDivisibleBy10 = departmentNumber % 10 == 0;
        if (isDivisibleBy10==true){
            return true;
        } else {
            return false;
        }
    }
}
