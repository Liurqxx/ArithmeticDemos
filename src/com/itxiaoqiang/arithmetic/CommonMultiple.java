package com.itxiaoqiang.arithmetic;

/**
 * ��С�������� �����˻��������Լ��
 * 
 * @author hello_liu
 * 
 */
public class CommonMultiple {

	public static int getMultiple(int a, int b) {

		int commonStein = CommonDivisor.getCommonStein(a, b);

		return (a * b) / commonStein;

	}

}
