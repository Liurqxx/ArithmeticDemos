package com.itxiaoqiang.arithmetic;

/**
 * 쳲���������
 * 
 * @author hello_liu
 * 
 */
public class FibonacciSequence {

	/**
	 * 
	 * @param num
	 *            Ҫ���ɵĸ���
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
