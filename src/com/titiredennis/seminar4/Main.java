package com.titiredennis.seminar4;

import java.util.IllegalFormatCodePointException;

//daca se divide cu 3 Fizz
//daca se divide cu 5 Buzz
// daca se divide si cu 3 si cu 5 Fizz Buzz
// 1->100
public class Main {
    public static void main(String[] args) {

//        for (int i = 0; i <= 100; i++) {
//            if ((i % 3 == 0) && (i % 5 == 0)) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

//        for(int i = 0; i<=100; i++) {
//            boolean isDivisible = false;

//            if (i % 3 == 0) {
//                isDivisible = true;
//                System.out.print("Fizz");
//            }
//            if (i % 4 == 0) {
//                isDivisible = true;
//                System.out.print("Buzz");
//            }
//            if (!isDivisible) {
//                System.out.println(i);
//            }
//            System.out.println();
//        }


        for (int i = 0; i <= 100; i++) {
            String output = "";

            if (i % 3 == 0) {
                output = output +"fizz";
            }
            if (i % 5 == 0) {
                output = output +"buzz";
            }
            if (output.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(output);
            }
        }
    }
}
