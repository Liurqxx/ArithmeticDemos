package com.itxiaoqiang.arithmetic;

/**
 * 水仙花数:153=1^3+5^3+3^5
 */
public class DaffodilNumber {

    public static boolean isDaffodil(int n) {

        long i, start, end, temp, num, sum;
        int j;

        start = (long) Math.pow(10, n - 1);
        end = (long) Math.pow(10, n) - 1;

        for (long k = start; k <= end; k++) {
            temp = 0;
            num = k;
            sum = 0;
            for (int l = 0; l < n; l++) {
                temp = num % 10;
                sum = sum + (long) Math.pow(temp, n);
                num = (num - temp) / 10;
            }
            if (sum == k) {
                return true;
            }
        }

        return false;

    }


}
