package com.leejefon.Array;

import java.util.Stack;

/**
 * Created by jefflee on 8/18/17.
 */
public class ReversePolishNotation {
    public static float exec(String[] tokens) {
        Stack stack = new Stack();
        float a, b;

        for (String token : tokens) {
            switch (token) {
                case "+":
                    a = (float) stack.pop();
                    b = (float) stack.pop();
                    stack.push(b + a);
                    break;
                case "-":
                    a = (float) stack.pop();
                    b = (float) stack.pop();
                    stack.push(b - a);
                    break;
                case "/":
                    a = (float) stack.pop();
                    b = (float) stack.pop();
                    stack.push(b / a);
                    break;
                case "*":
                    a = (float) stack.pop();
                    b = (float) stack.pop();
                    stack.push(b * a);
                    break;
                default:
                    stack.push(Float.parseFloat(token));
            }
        }

        return (float) stack.pop();
    }
}
