package com.phinehas.leetcode;

import java.util.Arrays;

/**
 * @author zhiyoupeng
 * @date 2018/9/25 0025
 */
public class RotateArray189 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        // 5,1,2,3,4
        int k = 3;
        rotate(nums , k);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] temp = Arrays.copyOf(nums,nums.length);
        for (int i = 0; i < temp.length; i++) {
            int dot = i+k>=temp.length? i+k-temp.length:i+k;
            nums[dot] = temp[i];
        }

    }

}
