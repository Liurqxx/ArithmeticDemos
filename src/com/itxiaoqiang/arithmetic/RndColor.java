package com.itxiaoqiang.arithmetic;

import java.util.Random;

public class RndColor {

    public static String getColor() {

        //��ɫ
        String red;
        //��ɫ
        String green;
        //��ɫ
        String blue;
        //�����������
        Random random = new Random();
        //���ɺ�ɫ��ɫ����
        red = Integer.toHexString(random.nextInt(256)).toUpperCase();
        //������ɫ��ɫ����
        green = Integer.toHexString(random.nextInt(256)).toUpperCase();
        //������ɫ��ɫ����
        blue = Integer.toHexString(random.nextInt(256)).toUpperCase();

        //�жϺ�ɫ�����λ��
        red = red.length() == 1 ? "0" + red : red;
        //�ж���ɫ�����λ��
        green = green.length() == 1 ? "0" + green : green;
        //�ж���ɫ�����λ��
        blue = blue.length() == 1 ? "0" + blue : blue;
        //����ʮ��������ɫֵ
        String color = "#" + red + green + blue;
        return color;

    }


    public static void main(String[] args) {

//        var color = '#';
//        for(var i=0;i<6;i++){
//            color+=parseInt(Math.random()*16 | 0).toString(16);
//        }
//        return color;

    }


}
