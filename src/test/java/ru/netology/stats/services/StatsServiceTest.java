package ru.netology.stats.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void sumSalesTest() {
        StatsService service = new StatsService();

        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expected = 180;
        int actual = service.sumCalc(sales);

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void averageSalesTest() {
        StatsService service = new StatsService();

        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expected = 15;
        int actual = service.averageSalesCalc(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSalesTest() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMonth = 8;
        int actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void minSalesTest () {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void salesUnderAverageTest () {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedNumberOfMonths = 5;
        int actualNumberOfMonths = service.salesUnderAverageCalc(sales);

        Assertions.assertEquals(expectedNumberOfMonths, actualNumberOfMonths);
    }

    @Test
    public void salesAboveAverageTest () {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedNumberOfMonths = 5;
        int actualNumberOfMonths = service.salesAboveAverageCalc(sales);

        Assertions.assertEquals(expectedNumberOfMonths, actualNumberOfMonths);
    }
}
