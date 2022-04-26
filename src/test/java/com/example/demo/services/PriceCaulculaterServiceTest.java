package com.example.demo.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriceCaulculaterServiceTest {
    @Test
    void getPriceByAge() {
        //Arrange
        PriceCaulculaterService service = new PriceCaulculaterService();
        //laver testdata - giver input der er 3 år.
        int travelForFreeTestData = 3;
        int travelforFreeExpectedResult = 0;

        //Act
        int travelForFreeResult = service.getPriceByAge(travelForFreeTestData);

        //Assert
        assertEquals(travelforFreeExpectedResult,travelForFreeResult);
    }

  /*  void getPriceByAge() {
        //Arrange
        PriceCaulculaterService service = new PriceCaulculaterService();
        //laver testdata - giver input der er 3 år.
        int travelForFreeTestData = 3;
        int travelforFreeExpectedResult = 0;

        //Act
        int travelForFreeResult = service.getPriceByAge(travelForFreeTestData);

        //Assert
        assertEquals(travelforFreeExpectedResult,travelForFreeResult);
    }*/
}