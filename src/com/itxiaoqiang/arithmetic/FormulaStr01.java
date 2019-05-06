package com.itxiaoqiang.arithmetic;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * 计算字符串公式：利用script引擎
 */
public class FormulaStr01 {

    public static Object getFormula(String str) {
        Object d = new Object();
        //获取script引擎
        ScriptEngine se = new ScriptEngineManager().getEngineByName("JavaScript");
        try {
            d = se.eval(str);
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        return d;
    }


}
