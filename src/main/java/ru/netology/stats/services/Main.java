package ru.netology.stats.services;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        StatsService service = new StatsService();
        int sum = service.sumSalesCalc(8,15,13,15,17,20,19,20,7,14,14,18);
        System.out.println("Сумма всех продаж = " + sum);

        int average = service.averageSalesCalc(8,15,13,15,17,20,19,20,7,14,14,18);
        System.out.println("Средняя сумма продаж в месяц = " + average);

        int maxMonth = service.maxSales(sales);
        System.out.println("Номер месяца, в котором был пик продаж = " + maxMonth);

        int minMonth = service.minSales(sales);
        System.out.println("Номер месяца, в котором был минимум продаж = " + minMonth);

        int monthsUnderAver = service.salesUnderAverageCalc(sales);
        System.out.println(monthsUnderAver);

        int monthsAboveAver = service.salesAboveAverageCalc(sales);
        System.out.println(monthsAboveAver);

    }

    }