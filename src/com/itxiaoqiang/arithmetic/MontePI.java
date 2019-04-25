package com.itxiaoqiang.arithmetic;

public class MontePI {

    /**
     * 蒙特卡罗算法计算π
     *
     * @param n
     * @return
     */
    public static double getMonte(int n) {

        double PI;
        double x, y;
        int i, sum;
        sum = 0;
        for (int j = 1; j < n; j++) {
            x = Math.random();
            y = Math.random();
            if ((x * x + y * y) <= 1) {
                sum++;
            }
        }
        PI = 4.0 * sum / n;

        return PI;


    }


}
