package com.oop11;

import java.util.Random;

public class ArrayTest5 {

    public static int[] makeNumber() {
        Random random = new Random();
        int[] numbers = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(45) + 1;
        }
        return numbers;
    } // end of makeNumber method

    public static void main(String[] args) {
        int[] lotto = makeNumber();
        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + "\t");
        }
    } // end of main
} // end of class
