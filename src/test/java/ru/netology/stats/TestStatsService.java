package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStatsService {
    @Test
    public void testSumSales() {
        StatsService service = new StatsService();
        int[] saleMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.summaSales(saleMonth);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAvarageSum() {
        StatsService service = new StatsService();
        int[] saleMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.avarageSum(saleMonth);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSearchMaxSales() {
        StatsService service = new StatsService();
        int[] saleMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.searchMaxSales(saleMonth);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void searchMinSales() {
        StatsService service = new StatsService();
        int[] saleMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.searchMinSales(saleMonth);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sumDayBestAvarge() {
        StatsService service = new StatsService();
        int[] saleMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.sumDayBestAvarge(saleMonth);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sumDayBelowAvarge() {
        StatsService service = new StatsService();
        int[] saleMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.sumDayBelowAvarge(saleMonth);
        Assertions.assertEquals(expected, actual);
    }

}
