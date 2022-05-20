package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldSum() {
        StatsService manager = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = manager.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAverage() {
        StatsService manager = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = manager.findAverage(sales);
        long expected = 15;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSales() {
        StatsService manager = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = manager.minSales(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void maxSales() {
        StatsService manager = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = manager.maxSales(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void lowAverage() {
        StatsService manager = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = manager.lowAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void higherAverage() {
        StatsService manager = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = manager.higherAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);

    }
}

