package ru.netology.javaqa.SalesStatistics.StatsService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {

    statsService service = new statsService();

    @Test
    public void shouldSumSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 207;
        int actualSum = service.sumSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldCalculateAverageSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expectedAverage = 17.25;
        double actualAverage = service.averageSales(sales);
        Assertions.assertEquals(expectedAverage, actualAverage, 0.001);
    }

    @Test
    public void shouldFindMaxSalesMonth() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxMonth = 6;
        int actualMaxMonth = service.maxSales(sales);
        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void shouldFindMinSalesMonth() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinMonth = 9;
        int actualMinMonth = service.minSales(sales);
        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void shouldCountBelowAverageSalesMonths() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedBelowAvgMonths = 5;
        int actualBelowAvgMonths = service.belowAverageSales(sales);
        Assertions.assertEquals(expectedBelowAvgMonths, actualBelowAvgMonths);
    }

    @Test
    public void shouldCountAboveAverageSalesMonths() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAboveAvgMonths = 7;
        int actualAboveAvgMonths = service.aboveAverageSales(sales);
        Assertions.assertEquals(expectedAboveAvgMonths, actualAboveAvgMonths);
    }
}