package com.example;

public class Main {

    public static void main(String[] args) {
        String s = "AAB";
        System.out.println(titleToNumber(s));
    }

    public static int titleToNumber(String s) {
        int sum = 0;
        int base = 0;
        for (int i = s.length()-1; i >= 0; --i) {
            if (i == s.length()-1) {
                sum += (s.charAt(i) % 64);
            } else {
                sum += ((s.charAt(i) % 64)*Math.pow(26,base));
            }
            base++;
        }
        return sum;
    }
}
