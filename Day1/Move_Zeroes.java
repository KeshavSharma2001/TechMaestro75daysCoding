package com.Keshav.Day1;

import java.util.Arrays;

public class Move_Zeroes {
    public static void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
//        ensures that all the non zero elements come at beginning
        while (j < nums.length) {
            if (nums[j] != 0) {
                nums[i++] = nums[j];
            }
            j++;
        }
//        place the 0's after non zero elements...i is index counter...0's added after last i
        while (i < nums.length) {
            nums[i++] = 0;
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        moveZeroes(new int[]{0,1,0,3,12});
    }
}
