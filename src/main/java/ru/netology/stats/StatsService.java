package ru.netology.stats;

public class StatsService {
    public int summaSales(int[] salesInMonth) {
        int sum = 0;
        for (int sale : salesInMonth) {
            sum = sum + sale;
        }
        return sum;
    }

    public int avarageSum(int[] salesInMontch) {
        int sum = summaSales(salesInMontch);
        int avarage = sum / salesInMontch.length;
        return avarage;
    }

    public int searchMaxSales(int[] salesMontch) {
        int maxSales = 0;
        for (int i = 0; i < salesMontch.length; i++) {
            if (salesMontch[i] >= salesMontch[maxSales]) {
                maxSales = i;
            }
        }
        return maxSales + 1;
    }

    public int searchMinSales(int[] salesMontch) {
        int minSales = 0;
        for (int i = 0; i < salesMontch.length; i++) {
            if (salesMontch[i] <= salesMontch[minSales]) {
                minSales = i;
            }
        }
        return minSales + 1;
    }

    public int sumDayBestAvarge(int[] salesMontch) {
        int dayBestAva = 0;
        int avarge = avarageSum(salesMontch);
        for (int sale : salesMontch) {
            if (sale > avarge) {
                dayBestAva = dayBestAva + 1;
            }
        }
        return dayBestAva;
    }

    public int sumDayBelowAvarge(int[] salesMontch) {
        int dayBelowAva = 0;
        int avarge = avarageSum(salesMontch);
        for (int sale : salesMontch) {
            if (sale < avarge) {
                dayBelowAva = dayBelowAva + 1;
            }
        }
        return dayBelowAva;
    }
}
