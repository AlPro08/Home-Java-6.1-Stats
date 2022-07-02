package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStatsService {

    @Test
    public void findSummSales() {

        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.getSummSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findAverageSalesAmount() {

        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.getAverageSalesAmount(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findMounthMaxSales() {

        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.getMounthMaxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findMounthMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.getMounthMinSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void findNumberMounthSalesLowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.getNumberMounthSalesLowAverage(sales);

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void findNumberMounthSalesHighAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.getNumberMounthSalesHighAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}
