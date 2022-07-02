package ru.netology.stats;

public class Main {

    public static void main(String[] args) {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        System.out.println("Сумма всех продаж = " + service.getSummSales(sales));
        System.out.println("Средняя сумма продаж в месяц = " + service.getAverageSalesAmount(sales));
        System.out.println("Номер месяца, в котором был пик продаж = " + service.getMounthMaxSales(sales));
        System.out.println("Номер месяца, в котором был минимум продаж =" + service.getMounthMinSales(sales));
        System.out.println("Кол-во месяцев, в которых продажи были ниже среднего = " + service.getNumberMounthSalesLowAverage(sales));
        System.out.println("Кол-во месяцев, в которых продажи были выше среднего = " + service.getNumberMounthSalesHighAverage(sales));
    }
}
