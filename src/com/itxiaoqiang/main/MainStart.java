package com.itxiaoqiang.main;

import com.itxiaoqiang.arithmetic.CommonDivisor;
import com.itxiaoqiang.arithmetic.FibonacciSequence;
import com.itxiaoqiang.arithmetic.RndColor;
import com.itxiaoqiang.arithmetic.HanoiTower;

public class MainStart {

	public static void main(String[] args) {

		/**
		 * 汉诺塔移动
		 */
		// long hanoi = HanoiTower.hanoi(2, 'A', 'B', 'C');
		// System.out.println("移动次数：" + hanoi);

		/**
		 * 随机颜色(16进制)
		 */
		// String color = RndColor.getColor();
		// System.out.println("颜色：" + color);

		/**
		 * 最大公约数
		 */
		// int num = CommonDivisor.getCommonDivide(48, 21);
		// System.out.println(num);
		//
		// int num2 = CommonDivisor.getCommonStein(345, 25);
		// System.out.println(num2);

		/**
		 * 斐波那契数列
		 */
		FibonacciSequence.getSequence(1000L);

	}

}
