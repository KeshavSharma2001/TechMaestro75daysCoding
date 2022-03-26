package com.Keshav.Day1;

import java.util.Arrays;

public class Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target)
                    return new int[] {i, j};
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] target_idx = twoSum(nums, 9);
        System.out.println(Arrays.toString(target_idx));
    }
}
