package com.pb.Trach.hw4;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {
    public static void main (String[] ags) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String line3 = Onlyletter (line1);
        String line4 = Onlyletter (line2);
        if (Matches(line3,line4) == true) {
            System.out.print("*"+line1+"*" + "и" + "*" + line2 + "*" + "\n");
            System.out.print("Поздравляю!!! Это АНАГРАМЫ!");
            }
        else {
            System.out.print("*" + line1 + "*" + "и" + "*" + line2 + "*" + "\n");
            System.out.print("Не АНАГРАМЫ!");
             }
         }
    static boolean Matches (String str1,String str2) {
        boolean match = str1.equals(str2);
        return match;
        }
    static String Onlyletter(String str) {
        String result = str.replaceAll("[^A-Za-zА-Яа-я]", "");
        result = result.toLowerCase(Locale.ROOT);
        result = Sort(result);
        return result;
        }
    static String Sort (String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        String sortedString = new String(charArray);
        return sortedString;
        }
    }



