package com.itxiaoqiang.arithmetic;

/**
 * [0-1]之间均匀分布的随机数算法
 */
public class RandomNumber {

    public static double getRandomNum(double[] r) {

        double base, u, v, p, temp1, temp2, temp3;
        base = 256.0;//基数
        u = 17.0;
        v = 139.0;

        temp1 = u * (r[0]) + v;//计算总值
        temp2 = (int) (temp1 / base);//计算商
        temp3 = temp1 - temp2 * base;//计算余数
        r[0] = temp3;//更新随机种子
        p = r[0] / base;//随机数
        return p;

    }


}
