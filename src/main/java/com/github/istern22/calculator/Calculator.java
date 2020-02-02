package com.github.istern22.calculator;

import java.util.*;

public class Calculator {

    private static final String LEFT_BRACKET = "(";
    private static final String RIGHT_BRACKET = ")";
    private static final String PLUS = "+";
    private static final String MINUS = "-";
    private static final String MULT = "*";
    private static final String DIV = "/";
    private static final String EXP = "^";

    private static final Map<String, Integer> PRIORITY = Map.of(
            LEFT_BRACKET, 0,
            RIGHT_BRACKET, 1,
            PLUS, 2,
            MINUS, 2,
            MULT, 3,
            DIV, 3,
            EXP, 4
    );

    public static boolean isDouble(String element) {
        try {
            Double.parseDouble(element);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static String convertToRpn(String expression) {
        var items = expression.split(" ");
        var operators = new ArrayList<String>();
        var result = "";
        for (var item : items) {
           if (isDouble(item)) {
               result += item + " ";
           } else if (PRIORITY.keySet().contains(item)) {
               if (operators.isEmpty()) {
                   operators.add(item);
               } else if (item.equals(LEFT_BRACKET)) {
                   operators.add(item);
               } else if (item.equals(RIGHT_BRACKET)) {
                    for (int i = operators.size() - 1; i >= 0; i--) {
                        if (!operators.get(i).equals(LEFT_BRACKET)) {
                            result += operators.get(i) + " ";
                            operators.remove(i);
                        }
                    }
               } else if (!operators.isEmpty()) {
                   for (int i = operators.size() - 1; i >= 0; i--) {
                       if (PRIORITY.get(operators.get(i)) >= PRIORITY.get(item)) {
                           result += operators.get(i) + " ";
                           operators.remove(i);
                       } else {
                           operators.add(item);
                           break;
                       }
                   }
               }
           } else {
               throw new ArithmeticException("Боля-боля.");
           }
        }
        return result.trim();
    }

    public static double calculate(String expression) {
        var result = new ArrayList<Double>();
        var items = convertToRpn(expression).split(" ");
        for (var item : items) {
            if (isDouble(item)) {
                result.add(Double.parseDouble(item));
            } else {
                switch (item) {
                    case PLUS :
                        result.set(result.size() - 2, result.get(result.size() - 2) + result.get(result.size() - 1));
                        result.remove(result.size() - 1);
                    break;
                    case MINUS :
                        result.set(result.size() - 2, result.get(result.size() - 2) - result.get(result.size() - 1));
                        result.remove(result.size() - 1);
                        break;
                    case MULT :
                        result.set(result.size() - 2, result.get(result.size() - 2) * result.get(result.size() - 1));
                        result.remove(result.size() - 1);
                        break;
                    case DIV :
                        result.set(result.size() - 2, result.get(result.size() - 2) / result.get(result.size() - 1));
                        result.remove(result.size() - 1);
                        break;
                    /**case "^" :
                        result.set(0, Math.pow(result.get(0), );
                        result.remove(1);
                        break;*/
                    default:
                        break;
                }
            }
        }
        return result.get(0);
    }
}
