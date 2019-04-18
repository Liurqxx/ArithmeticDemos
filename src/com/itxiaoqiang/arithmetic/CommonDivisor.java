package com.itxiaoqiang.arithmetic;

/**
 * 最大公约数
 */
public class CommonDivisor {

	/**
	 * 辗转相除
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int getCommonDivide(int a, int b) {

		int m, n, r;

		if (a > b) {
			m = a;
			n = b;
		} else {
			m = b;
			n = a;
		}

		r = m % n;

		while (r != 0) {
			m = n;
			n = r;
			r = m % n;
		}

		return n;
	}

	/**
	 * Stein
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int getCommonStein(int a, int b) {

		int m, n, r;

		if (a > b) {
			m = a;
			n = b;
		} else {
			m = b;
			n = a;
		}

		// 较小数为0
		if (n == 0) {
			return m;
		}

		// m和n都是偶数
		if (m % 2 == 0 && n % 2 == 0) {
			return 2 * getCommonStein(m / 2, n / 2);
		}

		// m是偶数
		if (m % 2 == 0) {
			return getCommonStein(m / 2, n);
		}

		// n为偶数
		if (n % 2 == 0) {
			return getCommonStein(m, n / 2);
		}
		return getCommonStein((m + n) / 2, (m - n) / 2);
	}

}
