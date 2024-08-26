package ru.netology.javaqa.SalesStatistics.StatsService;

public class statsService {

    // Сумма всех продаж
    public int sumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    // Средняя сумма продаж
    public double averageSales(int[] sales) {
        return (double) sumSales(sales) / sales.length;
    }

    // Номер месяца с максимальными продажами
    public int maxSales(int[] sales) {
        int maxMonth = 0; // Индекс месяца с максимальными продажами
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i; // Обновляем индекс, если найден более высокий
            }
        }
        return maxMonth + 1; // Возвращаем в формате с 1
    }

    // Номер месяца с минимальными продажами
    public int minSales(int[] sales) {
        int minMonth = 0; // Индекс месяца с минимальными продажами
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i; // Обновляем индекс, если найден более низкий
            }
        }
        return minMonth + 1; // Возвращаем в формате с 1
    }

    // Количество месяцев ниже среднего
    public int belowAverageSales(int[] sales) {
        double average = averageSales(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    // Количество месяцев выше среднего
    public int aboveAverageSales(int[] sales) {
        double average = averageSales(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
}