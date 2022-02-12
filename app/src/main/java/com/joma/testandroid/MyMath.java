package com.joma.testandroid;

import java.util.Arrays;
import java.util.Collections;

public class MyMath {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mult(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public String reversWords(String word) {
        String[] array = word.split(" ");
        Collections.reverse(Arrays.asList(array));
        for (String reversWord : array) {
            if (reversWord.length() != 0) {
                try {
                    Integer.parseInt(reversWord);
                } catch (Exception e) {
                    System.out.println(reversWord);
                }
            }
        }
        return word;
    }
}