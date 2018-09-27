package com.phinehas.leetcode;

/**
 * @author zhiyp
 * @date 2018/9/27 0027
 */
public class ReverseInteger7 {
	/*
	输入: -123
	输出: -321
	输入: 120
	输出: 21
	 */
	public static void main(String[] args) {
		int x = 901000;
		System.out.println(reverse(x));
	}

	public static int reverse(int x) {
		if(x == 0){
			return 0;
		}
		String s = String.valueOf(x);
		StringBuilder sb = new StringBuilder();
		if(s.charAt(0) == '-'){
			sb.append("-");
		}
		boolean zero = true;
		char[] chars = String.valueOf(x).toCharArray();
		for (int i = chars.length - 1; i >= 0; i--) {
			if(chars[i] == '-'){
				continue;
			}
			if(zero && chars[i] == '0'){
				continue;
			}
			zero = false;
			sb.append(chars[i]);
		}
		Long i = Long.valueOf(sb.toString());
		if(i>Integer.MAX_VALUE || i<Integer.MIN_VALUE){
			return 0;
		}
		return i.intValue();
	}
}
