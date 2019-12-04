package com.company;

import java.util.stream.IntStream;

public class Day4Solution {
    int min = 128392;
    int max = 643281;

    int findNoPasswords(){
       // int[] password = new int[5];
        int[] range = IntStream.iterate(min, n -> n + 1).limit(max-min+1).toArray();
        int counter = 0;
        System.out.println(range[0] + " " + range[range.length-1]);

        for(int password: range) {
            int[] digits = Integer.toString(password).chars().map(c -> c-'0').toArray();
            if(isIncreasing(digits[0], digits[1], digits[2], digits[3], digits[4], digits[5]) &&
                    sameAdjecentDigits(digits[0], digits[1], digits[2], digits[3], digits[4], digits[5]) &&
                    strictAdjacentDigits(digits[0], digits[1], digits[2], digits[3], digits[4], digits[5])) {
                    counter++;
            }
        }

        return counter;
    }

    boolean sameAdjecentDigits(int a, int b, int c, int d, int e, int f){

          return (a == b) || (b == c) || (c == d) || (d == e) || (e ==f);
    }

    boolean strictAdjacentDigits(int a, int b, int c, int d, int e, int f){
        return  (a == b && b != c) ||
                (a != b && b == c && c != d) ||
                (b != c && c == d && d != e) ||
                (c != d && d == e && e != f) ||
                (d != e && e == f);
    }

    boolean isIncreasing(int a, int b, int c, int d, int e, int f){
        return a <= b && b <= c && c <= d && d <= e && e <= f;
    }
}
