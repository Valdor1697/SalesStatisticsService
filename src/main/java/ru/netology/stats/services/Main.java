package ru.netology.stats.services;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        StatsService service = new StatsService();
        int sum = service.sumCalc(sales);
        System.out.println("Сумма всех продаж = " + sum);

        int average = service.averageSalesCalc(sales);
        System.out.println("Средняя сумма продаж в месяц = " + average);

        int maxMonth = service.maxSales(sales);
        System.out.println("Номер месяца, в котором был пик продаж = " + maxMonth);

        int minMonth = service.minSales(sales);
        System.out.println("Номер месяца, в котором был минимум продаж = " + minMonth);

        int monthsUnderAver = service.salesUnderAverageCalc(sales);
        System.out.println("Количество месяцев, в которых продажи были ниже среднего = " + monthsUnderAver);

        int monthsAboveAver = service.salesAboveAverageCalc(sales);
        System.out.println("Количество месяцев, в которых продажи были выше среднего = " + monthsAboveAver);

    }

}