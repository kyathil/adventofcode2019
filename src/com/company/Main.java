package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        int result = 0;
        ArrayList<String> list = readInputAsArrayOfStrings();
        int[] array = getInputAsArray(list);

        for (int i: array) {
            result += getSum(i);
        }
        System.out.println(result);
    }

    private static ArrayList<String> readInputAsArrayOfStrings() throws FileNotFoundException {
        Scanner s = new Scanner(new File("day1input.txt"));
        ArrayList<String> list = new ArrayList<String>();

        while (s.hasNext()) {
            list.add(s.next());
        }
        s.close();

        return list;
    }


    private static int[] getInputAsArray(ArrayList<String> list) {
        int length = list.size();
        int[] newArray = new int[length];

        for (int i = 0; i <length; i++){
            newArray[i] = Integer.parseInt(list.get(i));
        }

        return newArray;
    }

    private static int getSum(int n) {
        //System.out.println("Current n:" + n);
        int fuel = (n / 3) - 2;
        if (n == 0 || fuel <= 0)
            return 0;
        return (fuel + getSum(fuel));
    }
}
