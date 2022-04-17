package ru.yandex.practicum;

public class BestSeries {

    public static void main(String[] args) {
        System.out.println(3 == maxSeries(new int[]{1, 1, 5, 6, 7, 1, 1, 5, 6, 1}, 5));
        System.out.println(1 == maxSeries(new int[]{5, 1, 1}, 5));
        System.out.println(2 == maxSeries(new int[]{5, 1, 5, 5, 1, 5}, 5));
        System.out.println(2 == maxSeries(new int[]{5, 4, 6, 5, 1, 7}, 5));
        System.out.println(4 == maxSeries(new int[]{5, 4, 6, 5, 1, 7, 6, 7, 8}, 5));
        System.out.println(5 == maxSeries(new int[]{5, 7, 6, 5, 8, 1, 6, 3}, 5));
    }

    public static int maxSeries(int[] monthData, int target){
        int count = 0 ;
        int maxSeries = 0;

        for (int i = 0; i < monthData.length; i++) {
            if (monthData[i] >= target){
                count++;
                if (count > maxSeries){
                    maxSeries = count;
                }
            } else {
                count = 0;
            }

        }
        return maxSeries;
    }
}
