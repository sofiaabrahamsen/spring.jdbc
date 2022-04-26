package com.example.demo.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayinfoCalculaterServiceTest {

    @Test
    void getDayinfoByTime() {
        //Arrange
        DayinfoCalculaterService service = new DayinfoCalculaterService();

        //morning test
        int dayEqualsMorningTestData = 5;
        String dayEqualsMorningExpectedResult = "morning";
        //afternoon test
        int dayEqualsAfternoonTestData = 12;
        String dayEqualsAfternoonExpectedResult = "afternoon";
        //evening test
        int dayEqualsEveningTestData = 16;
        String dayEqualsEveningExpectedResult = "evening";
        //night test
        //int dayEqualsNightTestData = 22;
        //String dayEqualsNightExpectedResult = "night";

        //Act
        String dayEqualsMorningResult = service.getDayinfoByTime(dayEqualsMorningTestData);
        String dayEqualsAfternoonResult = service.getDayinfoByTime(dayEqualsAfternoonTestData);
        String dayEqualsEveningResults = service.getDayinfoByTime(dayEqualsEveningTestData);
        //String dayEqualsNightResult = service.getDayinfoByTime(dayEqualsNightTestData);

        //Assert
        assertEquals(dayEqualsMorningExpectedResult, dayEqualsMorningResult);
        assertEquals(dayEqualsAfternoonExpectedResult,dayEqualsAfternoonResult);
        assertEquals(dayEqualsEveningExpectedResult, dayEqualsEveningResults);
        //assertEquals(dayEqualsNightExpectedResult, dayEqualsNightResult);
    }
}