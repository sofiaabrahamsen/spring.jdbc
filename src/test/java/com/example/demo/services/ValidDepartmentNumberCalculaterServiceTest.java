package com.example.demo.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidDepartmentNumberCalculaterServiceTest {

    @Test
    void isValidDepartmentDivisibleTrue() {
        //Arrange
        ValidDepartmentNumberCalculaterService service = new ValidDepartmentNumberCalculaterService();
        int departmentnumberIsDivisibleTestData = 10;
        boolean departmentnumberIsDivisibleExpectedResult = true;

        //Act
        boolean departmentnumberIsDivisibleResult = service.isValidDepartmentDivisible(departmentnumberIsDivisibleTestData);

        //Assert
        assertEquals(departmentnumberIsDivisibleExpectedResult, departmentnumberIsDivisibleResult);
    }

    @Test
    void isValidDepartmentDivisibleFalse() {
        //Arrange
        ValidDepartmentNumberCalculaterService service = new ValidDepartmentNumberCalculaterService();
        int departmentnumberIsDivisibleTestData = 11;
        boolean departmentnumberIsDivisibleExpectedResult = false;

        //Act
        boolean departmentnumberIsDivisibleResult = service.isValidDepartmentDivisible(departmentnumberIsDivisibleTestData);

        //Assert
        assertEquals(departmentnumberIsDivisibleExpectedResult, departmentnumberIsDivisibleResult);
    }
}