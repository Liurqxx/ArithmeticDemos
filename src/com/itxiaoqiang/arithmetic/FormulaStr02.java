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
        Stack<String> stack = new Stack<>();
        for (String element_suffix : suffix) {
            //��������֣���ջ
            if (Character.isDigit(element_suffix.charAt(0))) {
                stack.push(element_suffix);
            } else {
//                System.out.println("----����ǰ��---" + stack.toString());
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
//                System.out.println("�����" + stack.toString());
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
//        String s = "";
//        ArrayList<String> stringsList = new ArrayList<>();//���ڴ洢�ַ�������
//        for (char c : str.toCharArray()
//        ) {
//            if (!Character.isDigit(c)) {
//                if (s != "") {
//                    stringsList.add(s);
//                }
//                stringsList.add(c + "");
//                s = "";
//                continue;
//            } else {
//                s += c;//�����ۼ�
//            }
//        }
//        if (s != "") {
//            stringsList.add(s);
//        }

        ArrayList<String> stringLists = new ArrayList<>();
        String s = str.replaceAll("(\\d)+", " ");

        String[] split = str.replaceAll("[\\+\\-\\*\\/\\(\\)]{1,}", " ").trim().split(" ");

        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            stringLists.add((s.charAt(i) + "").equals(" ") ? split[index++] + "" : s.charAt(i) + "");
        }

        System.out.println("���ַ������뼯��:" + stringLists);
        return stringLists;
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
        ArrayList<String> suffix = new ArrayList<>();//���ڴ洢���ĺ�׺ʽ
        Stack<String> operator = new Stack<>();//���ڱȽ���������ȼ�
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
                        while (!"(".equals(operator.peek())) {
//                            System.out.println("---operator----" + operator.toString());
                            suffix.add(operator.pop());
//                            System.out.println("---suffix:--" + suffix);
                        }
                        operator.pop();//�����ų�ջ
//                        System.out.println("---operator----" + operator.toString());
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

    /**
     * �������
     *
     * @param str
     * @return
     */
    public static int getFormulaStr(String str) {

        return FormulaStr02.getResult(FormulaStr02.getSuffix(FormulaStr02.getArrayList(str)));

    }

    public static void main(String[] args) {

        String str = "(45+89)*3221/89+(9-6)*8";
        // [,(45,+]
//        ArrayList<String> stringLists = new ArrayList<>();
//        String s = str.replaceAll("(\\d)+", " ");
//
//        String[] split = str.replaceAll("[\\+\\-\\*\\/\\(\\)]{1,}", " ").trim().split(" ");
//
//        int index = 0;
//        for (int i = 0; i < s.length(); i++) {
//            stringLists.add((s.charAt(i) + "").equals(" ") ? split[index++] + "" : s.charAt(i) + "");
//        }
//        System.out.println(stringLists.toString());

//        System.out.println(s.toString());
//        String[] s = str.split("(\\d)+");
//        System.out.println("�滻���ֺ�" + s);

//        String s1 = str.replaceAll("[\\+\\-\\*\\/\\(\\)]{1,}", ",");
//        System.out.println(s1.toString());

//        String[] split = str.split("[\\+\\-\\*\\/\\(\\)]");
//        System.out.println(split.length);
//        System.out.println("�滻�����ַ���" + s1);

//        System.out.println("---1---" + split.length);
//        System.out.println("---2--" + s.length);

//        for (int i = 0; i < str.length(); i++) {
//            stringLists.add(split[i].equals(" ") ? s[i] : split[i]);
//        }
//        for (int i = 0; i < split.length; i++) {

//            if (split[i].equals("")) {
//                System.out.println(s.charAt(index++) + "");
//
//            }
//            System.out.println(split[i]);
//            System.out.print("--" + s[i]);

//            stringLists.add(split[i].equals("") ? s[index++] + "" : split[i]);

//        }


//        String[] split = s1.split(" ");
//        for (String s : split
//        ) {
//            System.out.println(s);
//        }

//        String[] split = str.split("(\\d)+");
//
//        System.out.println("�ָ����ֺ�" + split.length);
//
//        for (String s : split
//        ) {
//            System.out.print(s);
//        }


//        int index = 0;
//        ArrayList<String> stringLists = new ArrayList<>();
//        for (char c : s1.toCharArray()) {
//
//            if (("" + c).isEmpty()) {
//                stringLists.add(s.charAt(index) + "");
//                index++;
//                System.out.println(s.charAt(index) + "---" + index);
//            } else
//                stringLists.add(c + "");
//        }
//        System.out.println(stringLists.toString());

    }


}


