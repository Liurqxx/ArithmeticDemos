package com.itxiaoqiang.arithmetic;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * �����ַ�����ʽ������script����
 */
public class FormulaStr01 {

    public static Object getFormula(String str) {
        Object d = new Object();
        //��ȡscript����
        ScriptEngine se = new ScriptEngineManager().getEngineByName("JavaScript");
        try {
            d = se.eval(str);
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        return d;
    }


}
