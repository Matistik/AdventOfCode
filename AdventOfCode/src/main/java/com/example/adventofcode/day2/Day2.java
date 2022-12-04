package com.example.adventofcode.day2;

import java.io.*;

public class Day2 {



    static final String FILE_NAME = "/home/matistikoff/Documents/AdventOfCodeGit/AdventOfCode/AdventOfCode/src/main/java/com/example/adventofcode/day2/input.txt";

    public static void main(String[] args) throws IOException {

        File file = new File(FILE_NAME);

        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        int playerScore = 0;

        while ((st = br.readLine()) != null){

            char elfMove = st.charAt(0);
            char playerMove = st.charAt(2);

            if (playerMove == 'X' && elfMove == 'A'){
                playerScore += 4;
            }
            else if (playerMove == 'X' && elfMove == 'B'){
                playerScore += 1;
            }
            else if (playerMove == 'X' && elfMove == 'C'){
                playerScore += 7;
            }

            else if (playerMove == 'Y' && elfMove == 'A'){
                playerScore += 8;
            }
            else if (playerMove == 'Y' && elfMove == 'B'){
                playerScore += 5;
            }
            else if (playerMove == 'Y' && elfMove == 'C'){
                playerScore += 2;
            }

            else if (playerMove == 'Z' && elfMove == 'A'){
                playerScore += 3;
            }
            else if (playerMove == 'Z' && elfMove == 'B'){
                playerScore += 9;
            }
            else if (playerMove == 'Z' && elfMove == 'C'){
                playerScore += 6;
            }
        }

        // dalo by sa to krajsie cez hash mapu, kde by som si nahodil vsetky moznosti ako BX, a value by bola pocet bodov,
        // potoom by som uz len poslal spojeny string

        System.out.println(playerScore);

    }


    }


