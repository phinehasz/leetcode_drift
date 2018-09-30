package com.phinehas.leetcode;

/**
 * @author zhiyp
 * @date 2018/9/30 0030
 */
public class LargeNum747 {
	public static void main(String[] args) {
		int[] nums = new int[]{1, 2, 3, 4};
		System.out.println(dominantIndex(nums));
	}

	/*
	输入: nums = [3, 6, 1, 0]
输出: 1
解释: 6是最大的整数, 对于数组中的其他整数,
6大于数组中其他元素的两倍。6的索引是1, 所以我们返回1.

    nums 的长度范围在[1, 50].
    每个 nums[i] 的整数范围在 [0, 99].

	 */
	public static int dominantIndex(int[] nums) {
		int largest = 0;
		int second = 0;
		int largestIndex = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > largest) {
				largest = nums[i];
				largestIndex = i;
			}
		}

		for (int i = 0; i < nums.length; i++) {
			if(nums[i] > second && largest > nums[i]){
			second = nums[i];
			}
		}
		if(largest >= 2*second){
			return largestIndex;
		}else{
			return -1;
		}
	}
}
