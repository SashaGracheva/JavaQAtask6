package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageSaleInMonth(long[] sales) {
        long average = 0;
        if (sales.length > 0) ;
        {
            average = sumSales(sales) / sales.length;
        }
        return average;
    }

    public int maxSale(long[] sales) {
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

    public int minSale(long[] sales) {
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

    public int numberOfMonthsUnderAverage(long[] sales) {
        int badMonths = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSaleInMonth(sales)) {
                badMonths++;
            }
        }
        return badMonths;
    }

    public int numberOfMonthsOverAverage(long[] sales) {
        int goodMonths = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSaleInMonth(sales)) {
                goodMonths++;
            }
        }
        return goodMonths;
    }

}
