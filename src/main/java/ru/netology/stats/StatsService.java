package ru.netology.stats;

public class StatsService {

    // Сумма всех продаж
    public static int getSumOfSales(int[] data) {
        int salesSum = 0;
        for (int i = 0; i < data.length; i++) {
            salesSum += data[i];
        }
        return salesSum;
    }

    // Средняя сумма продаж в месяц
    public static int getAverageOfSales(int[] data) {
        int avrg = getSumOfSales(data) / data.length;
        return avrg;
    }

    // Номер месяца, в котором был пик продаж
    public static int getMonthOfMaxSales(int[] data) {
        var maxSale = data[0];
        var numberOfMonth = 0;
        for (int i = 1; i < data.length; i++) {
            if (data[i] >= maxSale) {
                maxSale = data[i];
                numberOfMonth = i;
            }
        }
        return numberOfMonth + 1;
    }

    // Номер месяца, в котором был минимум продаж
    public static int getMonthOfMinSales(int[] data) {
        var minSale = data[0];
        var numberOfMonth = 0;
        for (int i = 1; i < data.length; i++) {
            if (data[i] <= minSale) {
                minSale = data[i];
                numberOfMonth = i;
            }
        }
        return numberOfMonth + 1;
    }

    // Кол-во месяцев, в которых продажи были ниже среднего
    public static int getAmountMonthsOfLowSales(int[] data) {
        var avrg = getAverageOfSales(data);
        var amount = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] < avrg) {
                amount += 1;
            }
        }
        return amount;
    }

    // Кол-во месяцев, в которых продажи были выше среднего
    public static int getAmountMonthsOfHighSales(int[] data) {
        var avrg = getAverageOfSales(data);
        var amount = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > avrg) {
                amount += 1;
            }
        }
        return amount;
    }
}

















