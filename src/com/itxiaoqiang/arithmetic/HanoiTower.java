package com.itxiaoqiang.arithmetic;

public class HanoiTower {

    static long count = 0;//����

    public static long hanoi(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.printf("��%d���ƶ�:Բ�̴�%c���ƶ���%c��\n", ++count, a, c);
        } else {
            hanoi(n - 1, a, c, b);
            System.out.printf("��%d���ƶ�:Բ�̴�%c���ƶ���%c��\n", ++count, a, c);
            hanoi(n - 1, b, a, c);
        }
        return count;
    }

    public static void main(String[] args) {

        int n = 10;//Բ������
        long startTime = System.currentTimeMillis();
        hanoi(n, 'A', 'B', 'C');
        long endTime = System.currentTimeMillis();
//        System.out.printf("�ܹ��ƶ�������%d\n", count);
        System.out.printf("��ʱ��%d", endTime - startTime);

    }


}
