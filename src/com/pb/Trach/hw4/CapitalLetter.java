package com.pb.Trach.hw4;

import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        String star = line.nextLine();
        String name = new String();
        name = Forwords(star);
        System.out.println(name);
    }
    static String Forwords(String str) {
        String name2 = new String();
        String[] words = str.split(" \\s ");
        for (int i = 0; i < words.length; i++) {
            words[i] = wordsUpperCase(words[i]);
            name2 = name2.concat(words[i] + "");
        }
        return name2;
    }

    static String wordsUpperCase (String word) {

        String output = word.substring(0, 1).toUpperCase() + word.substring(1);
        return output;

    }

}