package com.itxiaoqiang.main;

import com.itxiaoqiang.arithmetic.CommonDivisor;
import com.itxiaoqiang.arithmetic.FibonacciSequence;
import com.itxiaoqiang.arithmetic.RndColor;
import com.itxiaoqiang.arithmetic.HanoiTower;

public class MainStart {

	public static void main(String[] args) {

		/**
		 * ��ŵ���ƶ�
		 */
		// long hanoi = HanoiTower.hanoi(2, 'A', 'B', 'C');
		// System.out.println("�ƶ�������" + hanoi);

		/**
		 * �����ɫ(16����)
		 */
		// String color = RndColor.getColor();
		// System.out.println("��ɫ��" + color);

		/**
		 * ���Լ��
		 */
		// int num = CommonDivisor.getCommonDivide(48, 21);
		// System.out.println(num);
		//
		// int num2 = CommonDivisor.getCommonStein(345, 25);
		// System.out.println(num2);

		/**
		 * 쳲���������
		 */
		FibonacciSequence.getSequence(1000L);

	}

}
