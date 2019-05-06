package com.itxiaoqiang.arithmetic;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class demo {

    // 字符串的运算公式直接转计算结果
    public static void main(String[] args) {
        ScriptEngine se = new ScriptEngineManager().getEngineByName("JavaScript");
        String str = "2*3-45/5+9+9%5+3.6";
        try {
            Object d = se.eval(str);
            System.out.println(d);
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }

}
