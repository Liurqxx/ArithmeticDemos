package com.itxiaoqiang.arithmetic;

public class FactorialDemo {

    public static Long pact(int n) {

        if (n < 1) {
            return 1l;
        } else
            return n * pact(n - 1);

    }


}
