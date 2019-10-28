package com.github.istern22.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {

    private final char[] operations = {'/', '*', '-', '+'};

    public ArrayList<Character> toReversePolishNotation(String input) {
        List<String> output = new ArrayList<String>(Arrays.asList(input.split("")));
        System.out.println(output);
        return null;
    }
}
