package me.iqpizza6349.javalgorithm.chap02;

import java.util.Arrays;

public class DayOfYearAlgorithm {

    private static final int[][] dates = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
    };

    private int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    public int dayOfYear(int y, int m, int d) {
        while (m > 1) {
            d += dates[isLeap(y)][(--m) - 1];
        }
        return d;
    }

    private int getTotalDates(int year) {
        return Arrays.stream(dates[isLeap(year)]).sum();
    }

    public int leftDayOfYear(int y, int m, int d) {
        int totalDates = getTotalDates(y);
        int currentDates = dayOfYear(y, m, d);
        return totalDates - currentDates;
    }



    public static void main(String[] args) {
        DayOfYearAlgorithm algorithm = new DayOfYearAlgorithm();
        System.out.println(algorithm.leftDayOfYear(2022, 12, 30));
    }
}
