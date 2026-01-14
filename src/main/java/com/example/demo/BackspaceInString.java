//name: Backspace in String
// kyu: 6
// link: https://www.codewars.com/kata/5727bb0fe81185ae62000ae3
// task: Assume "#" is like a backspace in string. This means that string "a#bc#d" actually is "bd"
//Your task is to process a string with "#" symbols.
//
//Examples
//
//"abc#d##c"      ==>  "ac"
//"abc##d######"  ==>  ""
//"#######"       ==>  ""
//""              ==>  ""
package com.example.demo;
import java.util.Stack;

public class BackspaceInString {
    public String cleanString(String s) {
        // your code here
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c != '#'){
                stack.push(c);
            }
            else if(!stack.isEmpty()){
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c : stack){
            sb.append(c);
        }
        return sb.toString();
    }
}