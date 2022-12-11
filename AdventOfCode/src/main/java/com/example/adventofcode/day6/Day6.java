package com.example.adventofcode.day6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

public class Day6 {

    static final String FILE_NAME = "/home/matistikoff/Documents/AdventOfCodeGit/AdventOfCode/AdventOfCode/src/main/java/com/example/adventofcode/day6/input.txt";
    public static void main(String[] args) throws IOException {

        File file = new File(FILE_NAME);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st = br.readLine();

        aa:
            for(int i = 0; i < st.length();i++){

                HashMap<Character,Integer> characterHashMap = new HashMap<>();
                char lastChar = 0;

                for(int j = i; j < i+14;j++){
                    characterHashMap.put(st.charAt(j),j);
                     lastChar = st.charAt(j);
                }

                if (characterHashMap.size() >= 14){
                    System.out.println(characterHashMap.get(lastChar)+1);
                    break aa;
                }

            }

    }


}
