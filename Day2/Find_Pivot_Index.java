package com.Keshav.Day2;

public class Find_Pivot_Index {
    public static int pivotIndex(int[] nums) {
        int start = 0;
        int end = nums.length;
        for (int i = 0; i < nums.length; i++) {
            int sumLeft = sumLeft(start, i, nums);
            int sumRight = sumRight(i,end, nums);

            if (sumLeft == sumRight){
                return i;
            }
        }
        return -1;
    }

    public static int sumRight(int i, int end, int[] nums) {
        int sum = 0;
        if (i == end){
            return 0;
        }

        for (int j = i+1; j < end; j++) {
            sum += nums[j];
        }
        return sum;
    }

    public static int sumLeft(int start, int i, int[] nums) {
        int sum = 0;
        if(i == 0){
            return 0;
        }
        for (int j = start; j < i; j++) {
            sum += nums[j];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,-1};
        System.out.println(pivotIndex(nums));
    }
}
