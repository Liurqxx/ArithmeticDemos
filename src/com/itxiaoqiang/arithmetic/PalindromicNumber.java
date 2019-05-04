package com.itxiaoqiang.arithmetic;

/**
 * 判断一个整数是否是平方回文数
 */
public class PalindromicNumber {

    public static boolean isPalindromic(int a) {

        int temp, m, k, t, num, sum;

        int count, i, n;

        n = a * a;
        k = 1;
        count = 0;
        while (k > 0) {
            k = n - (int) Math.pow(10, count);
            count++;
        }

        m = count - 1;

        sum = 0;
        num = n;
        for (int j = 0; j < m; j++) {
            temp = num % 10;
            sum = sum + temp * ((int) Math.pow(10, m - 1 - j));
            num = (num - temp) / 10;
        }

        t = sum;
        if (t == n) {
            return true;
        }
        return false;

    }
}
