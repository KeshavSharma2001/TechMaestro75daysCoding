package com.Keshav.Day2;

import java.util.Arrays;

public class Squares_of_Sorted_Array {
    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.pow(nums[i], 2);
        }

        Arrays.sort(nums);

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] ans = sortedSquares(nums);
        System.out.println(Arrays.toString(ans));
    }
}
