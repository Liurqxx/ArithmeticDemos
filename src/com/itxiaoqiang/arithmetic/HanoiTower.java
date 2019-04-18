package com.itxiaoqiang.arithmetic;

public class HanoiTower {

    static long count = 0;//次数

    public static long hanoi(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.printf("第%d次移动:圆盘从%c棒移动到%c棒\n", ++count, a, c);
        } else {
            hanoi(n - 1, a, c, b);
            System.out.printf("第%d次移动:圆盘从%c棒移动到%c棒\n", ++count, a, c);
            hanoi(n - 1, b, a, c);
        }
        return count;
    }

    public static void main(String[] args) {

        int n = 10;//圆盘数量
        long startTime = System.currentTimeMillis();
        hanoi(n, 'A', 'B', 'C');
        long endTime = System.currentTimeMillis();
//        System.out.printf("总共移动次数：%d\n", count);
        System.out.printf("耗时：%d", endTime - startTime);

    }


}
