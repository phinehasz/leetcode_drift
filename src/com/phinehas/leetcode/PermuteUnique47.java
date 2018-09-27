package com.phinehas.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhiyoupeng
 * @date 2018/9/25 0025
 */
public class PermuteUnique47 {
    /*
    输入: [1,1,2]
    输出:
    [1,1,2] = 3*2/2*1 = 3
    [1,1,1] = 3*2/3*2 = 1
    [1,2,3] = 3*2/1 = 6
    [
      [1,1,2],
      [1,2,1],
      [2,1,1]
    ]
     */
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        //TODO
        System.out.println(permuteUnique(nums));
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> lists = new ArrayList<>();
		//int count = num.l
		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			
		}
        return null;
    }
}
