package com.pb.Trach.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        int x = array.length;
        for (int i = 0; i < x; i++) {
            System.out.println(array[i] + "");
            array[i] = input.nextInt();
            System.out.println("введіть ціле число");
        }
        int sum = Arrays.stream(array).sum();
        System.out.println(" сума цілих чисел " + sum);
        int positive = 0;
        for (int i = 0; i < x; i++) {
                if (array[i] >= 0)
                positive++;
        }
        System.out.println( positive+ "  позитивних цифр ");

        boolean isSorted = false;
        int big;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < x - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    big = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = big;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println( "сортуємо від меньшого до більшого");

    }
}








