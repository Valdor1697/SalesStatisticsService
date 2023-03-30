package ru.netology.stats.services;

import java.util.Arrays;

public class StatsService {
    public int sumCalc(int[] sales) {
        int sumSales = 0;
        for (int s : sales) {
            sumSales = sumSales + s;
            }
        return sumSales;
        }

    public int averageSalesCalc(int[] sales) {
        int sumSales = sumCalc(sales);
        int months = sales.length;
        int average = sumSales / months;
        return average;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int salesUnderAverageCalc(int[] sales) {
        int monthUnderAver = 0;
        int months = sales.length;
        int average = averageSalesCalc(sales);

        for (int i = 0; i < months; i++) {
            if (sales[i] < average) {
                monthUnderAver++;
            }
        }
        return (int) monthUnderAver;
    }

    public int salesAboveAverageCalc(int[] sales) {
        int monthAboveAver = 0;
        int months = sales.length;
        int average = averageSalesCalc(sales);

        for (int i = 0; i < months; i++) {
            if (sales[i] > average) {
                monthAboveAver++;
            }
        }
        return (int) monthAboveAver;
    }
}