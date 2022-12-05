package com.example.adventofcode.day4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Day4 {
    static final String FILE_NAME = "/home/matistikoff/Documents/AdventOfCodeGit/AdventOfCode/AdventOfCode/src/main/java/com/example/adventofcode/day4/input.txt";
    public static void main(String[] args) throws IOException {

        File file = new File(FILE_NAME);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;

        Integer counter = 0;
        while ((st = br.readLine()) != null){

            String parts[] = st.split(",");
            String[] partsFirst = (parts[0].split("-"));
            String[] partsSecond = (parts[1].split("-"));
            Integer firstPairNum1 = Integer.parseInt(partsFirst[0]);
            Integer firstPairNum2 = Integer.parseInt(partsFirst[1]);

            Integer secondPairNum1 = Integer.parseInt(partsSecond[0]);
            Integer secondPairNum2 = Integer.parseInt(partsSecond[1]);

            if( (Math.abs(firstPairNum1 - firstPairNum2)) > (Math.abs(secondPairNum1 - secondPairNum2))  ){

                       if (firstPairNum1 <= secondPairNum1 && firstPairNum2 >=secondPairNum2){
                        counter++;
                        }
            }
            else {
                if (firstPairNum1 >= secondPairNum1 && firstPairNum2 <=secondPairNum2){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }

}

