package com.itxiaoqiang.arithmetic;

/**
 * 最小公倍数： 两数乘积除以最大公约数
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
