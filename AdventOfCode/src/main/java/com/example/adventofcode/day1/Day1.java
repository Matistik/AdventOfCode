package com.example.adventofcode.day1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Day1 {

    public static void main(String[] args) throws IOException {

        File file = new File("/home/matistikoff/Documents/AdventOfCodeGit/AdventOfCode/AdventOfCode/src/main/java/com/example/adventofcode/day1/input.txt");

        int elfCalories[] = new int[1000];
        Integer elfNumber = 0;
        Integer bigCaloryElf = 0;

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;

        while ((st = br.readLine()) != null){

            if (st.equals("")){
                if (elfNumber == 0){
                    bigCaloryElf = elfCalories[0];
                }
                else {
                    if (elfCalories[elfNumber] > bigCaloryElf){
                        bigCaloryElf = elfCalories[elfNumber];
                    }
                }
                elfNumber++;
                continue;
            }
            elfCalories[elfNumber] += Integer.parseInt(st);
        }

        System.out.println(bigCaloryElf);

    }
}
