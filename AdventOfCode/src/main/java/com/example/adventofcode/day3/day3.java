package com.example.adventofcode.day3;

import java.io.*;
import java.util.HashMap;

public class day3 {

    static final String FILE_NAME = "/home/matistikoff/Documents/AdventOfCodeGit/AdventOfCode/AdventOfCode/src/main/java/com/example/adventofcode/day3/input.txt";


    public static void main(String[] args) throws IOException {

        File file = new File(FILE_NAME);

        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;


        //druhe


        char theOne2 = 0;
        int score = 0;

        while ((st = br.readLine()) != null){
            HashMap<Character, Character> hashMap = new HashMap<>();
            String firstHalf = st.substring(0,st.length()/2);
            String secondHalf = st.substring(st.length()/2);

            for(int i =0; i < firstHalf.length();i++){
                hashMap.put(firstHalf.charAt(i),firstHalf.charAt(i));
            }
            for(int i =0; i < secondHalf.length();i++){

                if (hashMap.containsKey(secondHalf.charAt(i))){
                    theOne2 = hashMap.get(secondHalf.charAt(i));
                }
            }

            if (Character.isUpperCase(theOne2)){
                System.out.println((int) theOne2 - 38);
                score += (int) theOne2 - 38;
            }
            else {
                System.out.println((int) theOne2 - 96);
                score += (int) theOne2 - 96;
            }




        }
        System.out.println(score);
    }

}
