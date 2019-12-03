package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Day3Solution {
    int[] centralPort = {0,0};
    List<int[]> coords = new ArrayList<int[]>();

    int distanceToCentralPort(String input){

        char direction = input.charAt(0);
        int steps = Integer.parseInt(input.substring(1));
        int i = 0;
        coords.add(centralPort);

        while(steps > 0) {
            int[] position = coords.get(i);

            if(direction == 'R'){
                position[1] += 1;
                coords.add(position);
            }
            else if(direction == 'L') {
                position[1] -= 1;
                coords.add(position);
            }
            else if (direction == 'U') {
                position[0] += 1;
                coords.add(position);

            }
            else if(direction == 'D') {
                position[0] -= 1;
                coords.add(position);
            }
            else {
                System.out.println("Error");
            }
            System.out.println(Arrays.toString(position));
            steps--;
            i++;
        }

        return 0;

    }
}
