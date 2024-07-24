package com.demo.leetcode150Problems;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("[)]"));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character ch : s.toCharArray()) {
            if(ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else if ((ch == '}' || ch == ']' || ch == ')') && !stack.isEmpty()) {
                if(ch == ']' && stack.peek().equals('[') ){
                    stack.pop();
                } else if (ch == '}' && stack.peek().equals('{')) {
                    stack.pop();
                } else if (ch == ')' && stack.peek().equals('(')) {
                    stack.pop();
                }
                else return false;
            }
            else return false;
        }
        return stack.isEmpty();
    }
}
