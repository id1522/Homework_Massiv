package com.company;

import java.util.Scanner;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Введите число для проверки:  ");
        Scanner scan = new Scanner(System.in);
        while (true) {
            int a = scan.nextInt();
            if (a >= array[0] & a <= array[9]) {
                System.out.println("Есть такое число " + Arrays.toString(array));
                continue;
            } else if (a < array[0] || a > array[9]) {
                System.out.println("Такого числа нет " + Arrays.toString(array));
                return;
            }
        }
    }

}


