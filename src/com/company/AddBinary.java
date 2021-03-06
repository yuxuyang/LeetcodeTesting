package com.company;
/*
67
Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".
*/
import java.lang.Object;


public class AddBinary {
     public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1, j = b.length()-1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0) sum += b.charAt(j--) - '0';
            if (i >= 0) sum += a.charAt(i--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if(carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }

    public static void main(String[] args){
        String a = "100";
        String b = "100";
        String result = addBinary(a,b);
        System.out.println(result);
    }
}

