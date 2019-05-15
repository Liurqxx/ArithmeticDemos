package com.itxiaoqiang.arithmetic;

public class demo implements Cloneable {

    public String name;
    public int age;

    public demo clone() {
        try {
            return (demo) super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return null;
        }
    }


    public static void main(String[] args) {

        demo c1 = new demo();
        demo c2 = (demo) c1.clone();
        System.out.println(c1 == c2);

    }


}
