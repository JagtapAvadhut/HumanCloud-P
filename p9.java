package org.example.humancloud;

import java.util.Stack;

public class p9 {
    public static void main(String[] args) {

        //7	Validate Bracket String	"Given a string containing '(', ')', '{', '}', '[', and ']'
        // , determine if it is valid. A string is valid if brackets are closed in the correct
        // order and match their types.	"
        // """()[]{}""	"	TRUE
//			"""(]""	"	FALSE

        System.out.println(isValid("()[]{}"));  // TRUE
        System.out.println(isValid("(]"));      // FALSE

    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
