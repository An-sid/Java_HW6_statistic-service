package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void getSumOfSalesOnValidTestData() {
        //StatsService service = new StatsService();
        int[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = StatsService.getSumOfSales(data);
        assertEquals(expected, actual);
    }

    @Test
    void getAverageOfSalesOnValidTestData() {
        //StatsService service = new StatsService();
        int[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = StatsService.getAverageOfSales(data);
        assertEquals(expected, actual);
    }

    @Test
    void getMonthOfMaxSalesOnValidTestData() {
        //StatsService service = new StatsService();
        int[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = StatsService.getMonthOfMaxSales(data);
        assertEquals(expected, actual);
    }

    @Test
    void getMonthOfMinSalesOnValidTestData() {
        //StatsService service = new StatsService();
        int[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = StatsService.getMonthOfMinSales(data);
        assertEquals(expected, actual);
    }

    @Test
    void getMonthsOfLowSalesOnValidTestData() {
        //StatsService service = new StatsService();
        int[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = StatsService.getAmountMonthsOfLowSales(data);
        assertEquals(expected, actual);
    }

    @Test
    void getMonthsOfHighSalesOnValidTestData() {
        //StatsService service = new StatsService();
        int[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = StatsService.getAmountMonthsOfHighSales(data);
        assertEquals(expected, actual);
    }
}