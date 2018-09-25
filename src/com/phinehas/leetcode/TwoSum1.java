package com.phinehas.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhiyp
 * @date 2018/9/25 0025
 */
public class TwoSum1 {
	/*
	给定 nums = [2, 7, 11, 15], target = 9

因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
	 */
	public static void main(String[] args) {
		int[] nums = {3,2,4};
		System.out.println(Arrays.toString(twoSum(nums,6)));
	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer,Integer> map= new HashMap<>();
		int x = 0;
		int y= 0;
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i],i);
		}
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(target - nums[i])){
				x = i;
				y = map.get(target - nums[i]);
				if(y != i){ break;}
			}
		}

		return new int[]{x,y};
	}
	public static int[] twoSum1(int[] nums, int target) {
		int x = 0;
		int y = 0;
		main:for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if(i == j){ continue;}
				if(nums[j]+nums[i] == target){
					x = i;
					y = j;
					break main;
				}
			}
		}
		return new int[]{x,y};
	}
}
