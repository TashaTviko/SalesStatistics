package ru.netology.javaqa.SalesStatistics.StatsService;

public class Main {
    public static void main(String[] args) {
        statsService statsService = new statsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int totalSales = statsService.sumSales(sales);
        double averageSales = statsService.averageSales(sales);
        int maxSalesMonth = statsService.maxSales(sales);
        int minSalesMonth = statsService.minSales(sales);
        int belowAvgMonths = statsService.belowAverageSales(sales);
        int aboveAvgMonths = statsService.aboveAverageSales(sales);

        System.out.println("Сумма всех продаж: " + totalSales);
        System.out.println("Средняя сумма продаж: " + averageSales);
        System.out.println("Номер месяца с максимальными продажами: " + maxSalesMonth);
        System.out.println("Номер месяца с минимальными продажами: " + minSalesMonth);
        System.out.println("Количество месяцев ниже среднего: " + belowAvgMonths);
        System.out.println("Количество месяцев выше среднего: " + aboveAvgMonths);
    }
}