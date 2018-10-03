package com.phinehas.leetcode;

/**
 * @author zhiyp
 * @date 2018/10/3 0003
 */
public class SingleNumber136 {
	/*
	给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
说明：
你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
示例 1:
输入: [2,2,1]
输出: 1
示例 2:
输入: [4,1,2,1,2]
输出: 4
	 */
	public static void main(String[] args) {
		int [] nums = new int[]{1,3,1,-1,3};
		System.out.println(singleNumber(nums));
	}

	//TODO
	public static int singleNumber(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		for (int i = 0; i < nums.length; i++) {
			if( (sum - nums[i])%2 == 0){
				return nums[i];
			}
		}
		return -1;
	}
}
