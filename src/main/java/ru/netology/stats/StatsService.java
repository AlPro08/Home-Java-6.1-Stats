package ru.netology.stats;

public class StatsService {

    public int getSummSales(int[] sales) {

        int summSales = 0;
        for (int i : sales) {
            summSales = summSales + i;
        }
        return summSales;
    }

    public int getAverageSalesAmount(int[] sales) {

        int averageSalesAmount = getSummSales(sales) / sales.length;
        return averageSalesAmount;
    }

    public int getMounthMaxSales(int[] sales) {
        int maxDay = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxDay]) {
                maxDay = i;
            }
        }
        return maxDay + 1;
    }

    public int getMounthMinSales(int[] sales) {
        int minDay = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minDay]) {
                minDay = i;
            }
        }
        return minDay + 1;
    }

    public int getNumberMounthSalesLowAverage(int[] sales) {
        int numberMonthSalesLowAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < getAverageSalesAmount(sales)) {
                numberMonthSalesLowAverage = numberMonthSalesLowAverage + 1;
            }
        }
        return numberMonthSalesLowAverage;
    }

    public int getNumberMounthSalesHighAverage(int[] sales) {
        int numberMounthSalesHighAverage = 0;
        for (int i : sales) {
            if (i > getAverageSalesAmount(sales)) {
                numberMounthSalesHighAverage = numberMounthSalesHighAverage + 1;
            }
        }
        return numberMounthSalesHighAverage;
    }
}

