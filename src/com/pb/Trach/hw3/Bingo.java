package com.pb.Trach.hw3;
import java.util.Random;
import java.util.Scanner;
public class Bingo {
    public static void main(String[] args) {
        System.out.println("вгадати число");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int abc = 100;
        int nume = random.nextInt(abc);
        int tray = 0;
        System.out.println("відгадайте число 0 до 100 ");
        System.out.println("хочете вийти? введіть 777 ");
        while (true) {
            System.out.println("вводьте число від 0 до " + abc);
            int number = scanner.nextInt();
            tray ++;
            if (number == nume) {
                System.out.println("Ви вгадали!!");
                System.out.println("кількість спроб: " + tray);
                break;
            } else if (number == 777) {
                System.out.println("набридло?. досвіданія ");
                break;
            } else if (number > nume) {
                System.out.println("загадане число меньше");
            } else {
                System.out.println("загадане число больше");
            }
        }
    }
}