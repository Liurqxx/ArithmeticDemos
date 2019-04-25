package com.itxiaoqiang.arithmetic;

/**
 * 折半查找
 */
public class BinarySearch {

    /**
     * @param a 数组
     * @param n 数组长度
     * @param x 要查找的数
     * @return 索引值
     */
    public static int getSearchFun(int a[], int n, int x) {

        int mid, low, high;

        low = 0;
        high = n - 1;

        while (low <= high) {
            mid = (low + high) / 2;
            if (a[mid] == x) {
                return mid;
            } else if (a[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return -1;

    }


}
