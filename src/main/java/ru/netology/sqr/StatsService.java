package ru.netology.sqr;

public class StatsService {
    public long sum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;

        }
        return sum;
    }

    public int findAverage(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return (int) sum / sales.length;
    }

    public int minSales(int[] sales) {
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

    public int maxSales(int[] sales) {
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

    public int lowAverage(int[] sales) {
        int sum = 0;
        int month = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int average = sum / 12;
        for (int sale : sales) {
            if (sale < average) {
                month++;
            }
        }
        return month;
    }

    public int higherAverage(int[] sales) {
        int sum = 0;
        int month = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int average = sum / 12;
        for (int sale : sales) {
            if (sale > average) {
                month++;
            }
        }
        return month;
    }
}


