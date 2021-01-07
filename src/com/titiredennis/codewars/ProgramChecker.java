package com.titiredennis.codewars;

public class ProgramChecker {

    public boolean check(String sentence) {
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        if (sentence.equals(alphabet)) {
            System.out.println("True");
            return true;
        } else
            System.out.println("False");
            return false;
    }
}
