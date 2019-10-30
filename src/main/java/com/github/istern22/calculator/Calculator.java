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

    public List<Double> getOperands(String input) {

        List<Double> operands = new ArrayList<>();

        List<String> sourceArray = new ArrayList<String>(Arrays.asList(input.split("")));

        return operands;
    }

    public double calculate(String input) {

        Double result = null;

        return result;
    }
}
