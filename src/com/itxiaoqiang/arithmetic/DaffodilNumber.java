package com.itxiaoqiang.arithmetic;

import java.util.ArrayList;
import java.util.List;

/**
 * 水仙花数:153=1^3+5^3+3^5
 */
public class DaffodilNumber {

    public static List isDaffodil(int n) {
        List<Long> daffodilList = new ArrayList<>();
        long k, start, end, temp, num, sum;
        int l;

        start = (long) Math.pow(10, n - 1);
        end = (long) Math.pow(10, n) - 1;

        for (k = start; k <= end; k++) {
            temp = 0;
            num = k;
            sum = 0;
            for (l = 0; l < n; l++) {
                temp = num % 10;
                sum = sum + (long) Math.pow(temp, n);
                num = (num - temp) / 10;
            }
            if (sum == k) {
                daffodilList.add(k);
            }
        }

        return daffodilList;

    }


}
