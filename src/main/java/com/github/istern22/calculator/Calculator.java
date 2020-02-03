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
        String[] items = expression.split(" ");
        var operators = new ArrayList<String>();
        var result = "";
        for (int i = 0; i < items.length; i++) {
            if (isDouble(items[i])) {
                result += items[i] + " ";
            } else if (PRIORITY.keySet().contains(items[i])) {
                if (operators.isEmpty() || items[i].equals(LEFT_BRACKET)) {
                    operators.add(items[i]);
                } else if (items[i].equals(RIGHT_BRACKET)) {
                    for (int j = operators.size() - 1; j >= 0; j--) {
                        if (!operators.get(j).equals(LEFT_BRACKET)) {
                            result += operators.get(j) + " ";
                            operators.remove(j);
                        } else {
                            operators.remove(LEFT_BRACKET);
                        }
                    }
                } else if (!operators.isEmpty()) {
                    for (int j = operators.size() - 1; j >= 0; j--) {
                        if (PRIORITY.get(operators.get(j)) >= PRIORITY.get(items[i])) {
                            result += operators.get(j) + " ";
                            operators.remove(j);
                        } else {
                            operators.add(items[i]);
                            break;
                        }
                    }
                } else {
                    throw new ArithmeticException("Ошибка в выражении.");
                }
            }
            if (i == items.length - 1) {
                for (int j = operators.size() - 1; j >= 0; j--) {
                    result += operators.get(j) + " ";
                    operators.remove(j);
                }
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
                    case EXP :
                        result.set(result.size() - 2, Math.pow(result.get(result.size() - 2), result.get(result.size() - 1)));
                        result.remove(result.size() - 1);
                        break;
                    default:
                        break;
                }
            }
        }
        return result.get(0);
    }
}
