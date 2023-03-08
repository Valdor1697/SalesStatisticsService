package ru.netology.stats.services;

import java.util.Arrays;

public class StatsService {
    public int sumSalesCalc(int m1, int m2, int m3, int m4, int m5, int m6, int m7, int m8, int m9, int m10, int m11, int m12) {
        int sum;
        sum = m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8 + m9 + m10 + m11 + m12;
        return sum;
    }

    public int averageSalesCalc(int m1, int m2, int m3, int m4, int m5, int m6, int m7, int m8, int m9, int m10, int m11, int m12) {
        int sum;
        sum = m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8 + m9 + m10 + m11 + m12;
        int months = 12;
        int average;
        average = sum / months;
        return average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                    maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int salesUnderAverageCalc(long[] sales) {
        long monthUnderAver = 0;
        int months = 12;
        int average;
        average = (int) ((Arrays.stream(sales).sum()) / months);

        for (int i = 0; i < months; i++) {
            if (sales[i] < average) {
                monthUnderAver++;
            }
        }
        return (int) monthUnderAver;
    }

    public int salesAboveAverageCalc(long[] sales) {
        long monthAboveAver = 0;
        int months = 12;
        int average;
        average = (int) ((Arrays.stream(sales).sum()) / months);

        for (int i = 0; i < months; i++) {
            if (sales[i] > average) {
                monthAboveAver++;
            }
        }
        return (int) monthAboveAver;
    }
    }

