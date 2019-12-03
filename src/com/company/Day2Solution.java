package com.company;

public class Day2Solution {

    int stopCode = 99;
    int stopSum = 19690720;

    int partB(int[] opcodes){
        int result = 0;

        for (int i = 0; i < 100; i++){
            for (int j = 0; j < 100; j++){
                result = calculateOpCode(opcodes, i, j);
                if(result == stopSum) {
                    System.out.println("Hello");
                    return (100 * i) + j;
                }
            }
        }
        return -1;
    }

    public int calculateOpCode(int[] opcodes, int noun, int verb) {
        int i = 0;
        int sum = 0;
        int[] mem = opcodes.clone();
        mem[1] = noun;
        mem[2] = verb;

        while(mem[i] != stopCode){
            if(mem[i+3] <= mem.length)
                sum = mem[i+3];


            int posA = mem[i+1];
            int posB = mem[i+2];

            if(mem[i] == 1){
                mem[sum] = mem[posA] + mem[posB];
            }
            else if (mem[i] == 2) {
                mem[sum] = mem[posA] * mem[posB];
            }
            else {
                System.out.println("error");
            }
            i += 4;
        }
        return mem[0];
    }
}
