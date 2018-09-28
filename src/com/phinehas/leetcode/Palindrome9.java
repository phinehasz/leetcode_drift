package com.phinehas.leetcode;

/**
 * @author zhiyp
 * @date 2018/9/28 0028
 */
public class Palindrome9 {
	/*
	示例 1:

输入: 121
输出: true

示例 2:

输入: -121
输出: false
解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。

示例 3:

输入: 10
输出: false
解释: 从右向左读, 为 01 。因此它不是一个回文数。

进阶:

你能不将整数转为字符串来解决这个问题吗？

	 */
	public static void main(String[] args) {
		System.out.println(isPalindrome(777121777));
	}

	//TODO 非字符串方式
	public static boolean isPalindrome(int x) {
		if(x<0) return false;
		if(x==0) return true;
		int ori = x;
		int result = 0;
		do {
			int a = x % 10;
			x = x / 10;
			result = result * 10 + a;
		} while (x > 0);
		return result==ori;
	}

	public static boolean isPalindrome1(int x) {
		if(x<0) return false;
		if(x==0) return true;
		return Long.valueOf(new StringBuilder(String.valueOf(x)).reverse().toString())==x;
	}
}
