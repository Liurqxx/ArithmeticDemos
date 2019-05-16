package com.itxiaoqiang.arithmetic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * �������ָ�����ȵ�������ĸ�ַ��������
 */
public class RandomPassword {
    public static final char[] allowedSpecialCharactors = {
            '`', '~', '@', '#', '$', '%', '^', '&',
            '*', '(', ')', '-', '_', '=', '+', '[',
            '{', '}', ']', '\\', '|', ';', ':', '"',
            '\'', ',', '<', '.', '>', '/', '?'};//�����ܰ����������ַ�
    private static final int letterRange = 26;
    private static final int numberRange = 10;
    private static final int spCharactorRange = allowedSpecialCharactors.length;
    private static final Random random = new Random();
    private int passwordLength;//����ĳ���
    private int minVariousType;//��������ַ�����������

    public RandomPassword(int passwordLength, int minVariousType) {
        if (minVariousType > CharactorType.values().length) minVariousType = CharactorType.values().length;
        if (minVariousType > passwordLength) minVariousType = passwordLength;
        this.passwordLength = passwordLength;
        this.minVariousType = minVariousType;
    }

    public String generateRandomPassword() {
        char[] password = new char[passwordLength];
        List<Integer> pwCharsIndex = new ArrayList();
        for (int i = 0; i < password.length; i++) {
            pwCharsIndex.add(i);
        }
        List<CharactorType> takeTypes = new ArrayList(Arrays.asList(CharactorType.values()));
        List<CharactorType> fixedTypes = Arrays.asList(CharactorType.values());
        int typeCount = 0;
        while (pwCharsIndex.size() > 0) {
            int pwIndex = pwCharsIndex.remove(random.nextInt(pwCharsIndex.size()));//������һλ����
            Character c;
            if (typeCount < minVariousType) {//���ɲ�ͬ�����ַ�
                c = generateCharacter(takeTypes.remove(random.nextInt(takeTypes.size())));
                typeCount++;
            } else {//�������������������
                c = generateCharacter(fixedTypes.get(random.nextInt(fixedTypes.size())));
            }
            password[pwIndex] = c.charValue();
        }
        return String.valueOf(password);
    }

    private Character generateCharacter(CharactorType type) {
        Character c = null;
        int rand;
        switch (type) {
            case LOWERCASE://���Сд��ĸ
                rand = random.nextInt(letterRange);
                rand += 97;
                c = new Character((char) rand);
                break;
            case UPPERCASE://�����д��ĸ
                rand = random.nextInt(letterRange);
                rand += 65;
                c = new Character((char) rand);
                break;
            case NUMBER://�������
                rand = random.nextInt(numberRange);
                rand += 48;
                c = new Character((char) rand);
                break;
            case SPECIAL_CHARACTOR://��������ַ�
                rand = random.nextInt(spCharactorRange);
                c = new Character(allowedSpecialCharactors[rand]);
                break;
        }
        return c;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(new RandomPassword(10, 3).generateRandomPassword());
        }
    }
}

enum CharactorType {
    LOWERCASE,
    UPPERCASE,
    NUMBER,
    SPECIAL_CHARACTOR
}

