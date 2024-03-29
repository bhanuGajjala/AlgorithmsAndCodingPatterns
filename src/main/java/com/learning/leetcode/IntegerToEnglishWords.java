package com.learning.leetcode;

public class IntegerToEnglishWords {

    String[] belowTen = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    String[] belowTwenty = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    String[] belowHundred = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        return helper(num);
    }

    private String helper(int num) {

        String result = new String();

        if (num < 10) {
            return belowTen[num];
        } else if (num < 20) {
            return belowTwenty[num - 10];
        } else if (num < 100) {
            return belowHundred[num / 10] + " " + helper(num % 10);
        } else if (num < 1000) {
            result = helper(num / 100) + " Hundred " + helper(num % 100);
        } else if (num < 1000000) {
            result = helper(num / 1000) + " Thousand " + helper(num % 1000);
        } else if(num < 1000000000){
            result = helper(num/1000000) + " Million " +  helper(num % 1000000);
        } else {
            result = helper(num/1000000000) + " Billion " + helper(num % 1000000000);
        }
        return result.trim();
    }

    public static void main(String[] args) {
        IntegerToEnglishWords in = new IntegerToEnglishWords();

        System.out.println(in.numberToWords(12345));
    }
}
