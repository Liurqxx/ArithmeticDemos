package com.itxiaoqiang.main;

import com.itxiaoqiang.arithmetic.*;

public class MainStart {

    public static void main(String[] args) {

        /**
         * ��ŵ���ƶ�
         *
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
         * ��С������
         */
//		int multiple = CommonMultiple.getMultiple(35, 45);
//		System.out.println(multiple);

        /**
         * ���ؿ��޼����
         */
//        double monte = MontePI.getMonte(500000000);
//        System.out.println("��������PI=" + monte);

        /**
         * �۰����
         */
//        int[] arrs = {1, 3, 5, 7, 8, 11, 34, 58, 54, 89};
//        int numIndex = BinarySearch.getSearchFun(arrs, arrs.length, 34);
//        System.out.println(numIndex);

        /**
         * �ݹ�׳�
         */
//        Long pact = FactorialDemo.pact(2);
//        System.out.println(pact);

        /**
         * �ж�ƽ��������
         */
//        boolean palindromic = PalindromicNumber.isPalindromic(181);
//        System.out.println(palindromic);

        /**
         * �о�nλ����ˮ�ɻ���
         * return:arraylist
         */
//        List daffodil = DaffodilNumber.isDaffodil(5);
//        System.out.println(daffodil);

        /**
         * ����[0-1]֮����ȷֲ��������
         */
//        double[] r = {5.0};
//        for (int i = 0; i < 10; i++) {
//            double randomNum = RandomNumber.getRandomNum(r);
//            System.out.println("randomNum:" + randomNum);
//        }

        /**
         * �ַ������͵Ĺ�ʽ���㷽ʽһ
         */
        Object formula = FormulaStr01.getFormula("4+8*4+9/3-2*3");
        System.out.println(formula.toString());

        /**
         * �ַ������͵Ĺ�ʽ���㷽ʽ��
         */
//        String str = "(2+35)*3+9*64/8+(2+41/3+(2+65/5))";
//        System.out.println("Ҫ����Ĺ�ʽ��" + str);
////        String str = "54+8";
//        System.out.println("��������"+FormulaStr02.getFormulaStr(str));
    }


}

