package com.calculator;

import java.util.Scanner;

public class CalculaorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = scanner.nextInt();

        int addition = Addition.addNumber(num1, num2);
        int subtration = Subtraction.subtractNumber(num1, num2);
        int multiplication = Multiplication.multiplyNumber(num1, num2);
        int divison = Division.divideNumber(num1, num2);
    }
}
