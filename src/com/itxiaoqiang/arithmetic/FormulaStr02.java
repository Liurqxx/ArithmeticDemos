package com.itxiaoqiang.arithmetic;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * java�����ַ������͵Ĺ�ʽ
 */
public class FormulaStr02 {

    /**
     * �������ϣ�����������ջ�������������������ֳ�վ���жϲ���������ִ����Ӧ�Ĳ���
     *
     * @param suffix
     * @return
     */
    public static int getResult(ArrayList<String> suffix) {
        Stack<String> stack = new Stack<String>();
        for (String element_suffix : suffix) {
            //��������֣���ջ
            if (Character.isDigit(element_suffix.charAt(0))) {
                stack.push(element_suffix);
            } else {
                //��������������ȡ��Ԫ�أ����жϲ�������ִ����Ӧ�ļ���
                //�Զ����䣺����װ��ת���ɻ�������
                //�Զ�װ�䣺����������ת���ɰ�װ��
                int ANumber = Integer.valueOf(stack.pop());//�Զ����䣬ȡ����һ��Ԫ��
                int BNumber = Integer.valueOf(stack.pop());//�Զ����䣬ȡ���ڶ���Ԫ��
                int result = 0;
                switch (element_suffix) {
                    case "+":
                        result = ANumber + BNumber;
                        break;
                    case "-":
                        result = ANumber - BNumber;
                        break;
                    case "*":
                        result = ANumber * BNumber;
                        break;
                    case "/":
                        result = ANumber / BNumber;
                        break;
                    default:
                        break;
                }
                stack.push(result + "");
            }
        }
        return Integer.valueOf(stack.pop());
    }

    /**
     * ���ַ���ת�ɼ���
     *
     * @param str ��ת���ַ���
     * @return
     */
    public static ArrayList<String> getArrayList(String str) {
        ArrayList<String> stringList = new ArrayList<>();//���ڴ洢�ַ�������
        for (char chs : str.toCharArray()) {
            stringList.add(chs + "");
        }
        System.out.println("���ַ������뼯��:" + stringList);
        return stringList;
    }

    /**
     * �Ƚϵ�ǰ�������ջ������������ȼ�
     *
     * @param stackPeek ջ��Ԫ��
     * @param current   ��ǰԪ��
     * @return
     */
    public static boolean getPriority(String stackPeek, String current) {
        if (stackPeek.matches("[\\*\\/]") && current.matches("[\\+\\-\\*\\/]")) {
            return true;
        } else if (stackPeek.matches("[\\+\\-]") && current.matches("\\+\\-")) {
            return true;
        }
        return false;
    }

    /**
     * ��ú�׺���ʽ
     *
     * @param infix �������׺���ʽ�ļ���
     * @return
     */
    public static ArrayList<String> getSuffix(ArrayList<String> infix) {
        ArrayList<String> suffix = new ArrayList<String>();//���ڴ洢���ĺ�׺ʽ
        Stack<String> operator = new Stack<String>();//���ڱȽ���������ȼ�
        //��һ�����������ֺ������
        for (String chs : infix)
            if (Character.isDigit(chs.charAt(0))) {//��������֣����뼯��
                suffix.add(chs);
            } else {
                //����������֣��������ź������
                switch (chs.charAt(0)) {
                    //������ֱ����ջ
                    case '(':
                        operator.push(chs);
                        break;
                    //�����ţ���ջ��ֱ�������ų�ջ
                    case ')':
                        while (!"(".equals(operator.peek()))
                            suffix.add(operator.pop());
                        operator.pop();//�����ų�ջ
                        break;
                    default:
                        //�������������ȱȽ����ȼ��������ǰԪ�ص����ȼ�����ջ��Ԫ�أ���ջ��Ԫ�س�ջ����ǰԪ�س�ջ
                        //ԭ���Ǳ�֤ջ��Ԫ�ص����ȼ����
                        //���ջ��Ԫ�����ȼ��ߣ�����true,ջ��Ԫ�س�ջ��ֱ������Ԫ�����ȼ����ڵ�ǰԪ��
                        while (!operator.isEmpty() && getPriority(operator.peek(), chs))
                            suffix.add(operator.pop());
                        operator.push(chs);//���ȼ��ߵ�ջ��Ԫ�س�ջ�󣬼������ȼ����͵�Ԫ��
                        break;
                }
            }
        //�ж�ջ���Ƿ���Ԫ�أ��еĻ���ȡ��
        while (!operator.isEmpty())
            suffix.add(operator.pop());
        System.out.println("��׺ʽ��:" + suffix);
        return suffix;
    }

    public static int getFormulaStr(String str) {

        return FormulaStr02.getResult(FormulaStr02.getSuffix(FormulaStr02.getArrayList(str)));

    }


}


