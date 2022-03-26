package com.Keshav.Day1;

import java.util.Arrays;

public class Plus_One {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
//            check if last digit is not 9
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
//            if last is 9
            digits[i] = 0;
        }
        int[] sum = new int[digits.length + 1];
        sum[0] = 1;
        return sum;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 9};
        int[] ans = plusOne(digits);
        System.out.println(Arrays.toString(ans));
    }
}
