package com.example.adventofcode.day5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Day5 {

    static final String FILE_NAME = "/home/matistikoff/Documents/AdventOfCodeGit/AdventOfCode/AdventOfCode/src/main/java/com/example/adventofcode/day5/input.txt";
    public static void main(String[] args) throws IOException {

        File file = new File(FILE_NAME);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;

        Stack<Character> crates1 = new Stack<>();
        crates1.push('D');
        crates1.push('L');
        crates1.push('V');
        crates1.push('T');
        crates1.push('M');
        crates1.push('H');
        crates1.push('F');
        Stack<Character> crates2 = new Stack<>();
        crates2.push('H');
        crates2.push('Q');
        crates2.push('G');
        crates2.push('J');
        crates2.push('C');
        crates2.push('T');
        crates2.push('N');
        crates2.push('P');
        Stack<Character> crates3 = new Stack<>();
        crates3.push('R');
        crates3.push('S');
        crates3.push('D');
        crates3.push('M');
        crates3.push('P');
        crates3.push('H');
        Stack<Character> crates4 = new Stack<>();
        crates4.push('L');
        crates4.push('B');
        crates4.push('V');
        crates4.push('F');
        Stack<Character> crates5 = new Stack<>();
        crates5.push('N');
        crates5.push('H');
        crates5.push('G');
        crates5.push('L');
        crates5.push('Q');
        Stack<Character> crates6 = new Stack<>();
        crates6.push('W');
        crates6.push('B');
        crates6.push('D');
        crates6.push('G');
        crates6.push('R');
        crates6.push('M');
        crates6.push('P');
        Stack<Character> crates7 = new Stack<>();
        crates7.push('G');
        crates7.push('M');
        crates7.push('N');
        crates7.push('R');
        crates7.push('C');
        crates7.push('H');
        crates7.push('L');
        crates7.push('Q');
        Stack<Character> crates8 = new Stack<>();
        crates8.push('C');
        crates8.push('L');
        crates8.push('W');
        Stack<Character> crates9 = new Stack<>();
        crates9.push('R');
        crates9.push('D');
        crates9.push('L');
        crates9.push('Q');
        crates9.push('J');
        crates9.push('Z');
        crates9.push('M');
        crates9.push('T');

        Stack<Character> crates1_1 = new Stack<>();
        crates1_1.push('Z');
        crates1_1.push('N');
        Stack<Character> crates1_2 = new Stack<>();
        crates1_2.push('M');
        crates1_2.push('C');
        crates1_2.push('D');
        Stack<Character> crates1_3 = new Stack<>();
        crates1_3.push('P');


        ArrayList<Stack<Character>> stackArrayList = new ArrayList<>();
//        stackArrayList.add(crates1_1);
//        stackArrayList.add(crates1_2);
//        stackArrayList.add(crates1_3);

        System.out.println(stackArrayList);



        stackArrayList.add(crates1);
        stackArrayList.add(crates2);
        stackArrayList.add(crates3);
        stackArrayList.add(crates4);
        stackArrayList.add(crates5);
        stackArrayList.add(crates6);
        stackArrayList.add(crates7);
        stackArrayList.add(crates8);
        stackArrayList.add(crates9);



        while ((st = br.readLine()) != null){

            String[] parts = st.split(" ");
            int count = Integer.parseInt(parts[1]);
            int from = Integer.parseInt(parts[3])-1;
            int to = Integer.parseInt(parts[5])-1;

            for (int i =0; i < count;i++){

                Character c =stackArrayList.get(from).peek();
                stackArrayList.get(to).push(c);
                stackArrayList.get(from).pop();

            }
        }

        System.out.println(stackArrayList);

        for (Stack stack: stackArrayList){
            System.out.print(stack.peek());
        }



    }

}
//            for (int i = 0; i < st.length(); i++){
//
//                if (Character.isUpperCase(st.charAt(i))){
//                    System.out.println(((i-1)/4)+1 + "" + st.charAt(i));
//
//
//
//                }
//            }




//
//    int count = Integer.parseInt(parts[1]);
//    int from = Integer.parseInt(parts[3])-1;
//    int to = Integer.parseInt(parts[5])-1;
//            System.out.println(":::BEFORE::: " + st);
//                    System.out.println(stackArrayList.get(from));
//                    System.out.println(stackArrayList.get(to));
//
//                    for (int i = stackArrayList.get(from).size()-count; i < stackArrayList.get(from).size(); i++) {
//        System.out.println(i);
//        Character c = stackArrayList.get(from).get(i);
//        stackArrayList.get(to).push(c);
//        }
//
//        for (int i = 0; i < count; i++) {
//        stackArrayList.get(from).pop();
//        }
//
//        System.out.println(":::AFTER:::");
//
//        System.out.println(stackArrayList);

