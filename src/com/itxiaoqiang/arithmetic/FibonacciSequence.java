package com.itxiaoqiang.arithmetic;

/**
 * 斐波那契数列
 * 
 * @author hello_liu
 * 
 */
public class FibonacciSequence {

	/**
	 * 
	 * @param num
	 *            要生成的个数
	 * @return
	 */
	public static void getSequence(Long num) {
		for (Long i = 1L; i <= num; i++) {

			// if (i <= 1) {
			// // return num;
			// System.out.println(i);
			// }

			System.out
					.println((long) ((Math.pow(((1 + Math.sqrt(5)) / 2), i) - Math
							.pow(((1 - Math.sqrt(5)) / 2), i)) / Math.sqrt(5)));
		}
	}

}
