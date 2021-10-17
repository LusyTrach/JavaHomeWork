package com.pb.Trach.hw2;


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int operand1;
        int operand2;
        System.out.println("ввести цифру №1");
        operand1 = enter.nextInt();
        System.out.println("ввести цифру №2");
        operand2 = enter.nextInt();
        System.out.println("ввести знак +");
        char sign = enter.next().charAt(0);
        int operand;
        switch (sign) {
            case '+':
                operand = operand1 + operand2;
                System.out.println("ответ 11: " + operand);
                break;
            case '-':
                operand = operand1 - operand2;
                System.out.println(" ответ 7: " + operand);
                break;
            case '*':
                operand = operand1 * operand2;
                System.out.println("ответ 18: " + operand);
                break;
            case '/':
                if (operand2 == 0) {
                    System.out.println(" нельзя делить на 0 ");
                    break;
                } else {
                    operand = operand1 / operand2;
                    System.out.println("ответ 3,5: " + operand);
                    break;
                }
        }
    }
}
