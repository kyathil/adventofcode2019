package com.company;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        int[] day2Input = {1,0,0,3,1,1,2,3,1,3,4,3,1,5,0,3,2,1,10,19,1,9,19,23,1,13,23,27,1,5,27,31,2,31,6,35,1,35,5,39,1,9,39,43,1,43,5,47,1,47,5,51,2,10,51,55,1,5,55,59,1,59,5,63,2,63,9,67,1,67,5,71,2,9,71,75,1,75,5,79,1,10,79,83,1,83,10,87,1,10,87,91,1,6,91,95,2,95,6,99,2,99,9,103,1,103,6,107,1,13,107,111,1,13,111,115,2,115,9,119,1,119,6,123,2,9,123,127,1,127,5,131,1,131,5,135,1,135,5,139,2,10,139,143,2,143,10,147,1,147,5,151,1,151,2,155,1,155,13,0,99,2,14,0,0};

        Day1Solution day1 = new Day1Solution();
        Day2Solution day2 = new Day2Solution();
        Day3Solution day3 = new Day3Solution();
        day3.distanceToCentralPort("R42");

        result1 = day1.calculateFuel();
        result2 = day2.calculateOpCode(day2Input.clone(), 12, 2);

        System.out.println("Day 1 solution = " + result1);
        System.out.println("Day 2 part A solution = " + result2);
        result3 = day2.partB(day2Input.clone());
        System.out.println("Day 2 part B solution = " + result3);
    }
}
