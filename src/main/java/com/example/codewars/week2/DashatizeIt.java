//kyu:6
//link: https://www.codewars.com/kata/58223370aef9fc03fd000071
//task:Given an integer, return a string with dash '-' marks before and after each odd digit, but do not begin or end the string with a dash mark.
//Ex:
//274 -> '2-7-4'
//6815 -> '68-1-5'

package com.example.codewars.week2;
public class DashatizeIt {

    public static String dashatize(int num) {
        String s = String.valueOf(Math.abs((long) num));
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            int digit = Character.getNumericValue(s.charAt(i));
            if(digit % 2 != 0){
                if(sb.length() > 0 && sb.charAt(sb.length() - 1) != '-'){
                    sb.append('-');
                }
                sb.append(digit);
                if( i < s.length() - 1){
                    sb.append('-');
                }

            }
            else{
                sb.append(digit);
            }
        }
        return sb.toString();
    }

}
