package com.github.istern22.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {

    public boolean checkString(String element) {
        try {
            Double.parseDouble(element);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public ArrayList<Character> toReversePolishNotation(String input) {
        List<Double> operand = new ArrayList<>();
        List<String> operations = new ArrayList<>();
        List<String> array = new ArrayList<String>(Arrays.asList(input.split("")));
        String number = "";
        for (int i = 0; i < array.size(); i++) {
            if (checkString(array.get(i))) {
                if (checkString(array.get(i + 1))) {
                    number = array.get(i) + array.get(i + 1);
                }
            operand.add(Double.parseDouble(number));
            }
            if (array.get(i) == "+") {
                operations.add(array.get(i));
            }
        }
        return null;
    }
}
