package com.itxiaoqiang.main;

import com.itxiaoqiang.arithmetic.*;

public class MainStart {

    public static void main(String[] args) {

        /**
         * 汉诺塔移动
         *
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
         * 最小公倍数
         */
//		int multiple = CommonMultiple.getMultiple(35, 45);
//		System.out.println(multiple);

        /**
         * 蒙特卡罗计算π
         */
//        double monte = MontePI.getMonte(500000000);
//        System.out.println("计算结果：PI=" + monte);

        /**
         * 折半查找
         */
//        int[] arrs = {1, 3, 5, 7, 8, 11, 34, 58, 54, 89};
//        int numIndex = BinarySearch.getSearchFun(arrs, arrs.length, 34);
//        System.out.println(numIndex);

        /**
         * 递归阶乘
         */
        Long pact = FactorialDemo.pact(2);
        System.out.println(pact);

        /**
         * 判断平方回文数
         */
        boolean palindromic = PalindromicNumber.isPalindromic(181);
        System.out.println(palindromic);

    }

}
