package com.company;

import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeMath.sqrt;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("++++Welcome++++\ntype /help");


        while (true){
            System.out.println("Enter first number:");
            double firstNum = sc.nextDouble();
            System.out.println("Enter first number:");
            double secondNum = sc.nextDouble();

        }
    }
    private void router(String str,double num1,double num2){
        str = str.toLowerCase();
        switch (str){
            case "/help":
                help();
                break;
            case "/add":
                add(num1,num2);
                break;
            case "/sub":
                sub(num1,num2);
                break;
            case "/mul":
                mul(num1,num2);
                break;
            case "/div":
                div(num1,num2);
                break;
            default:
                help();
        }
    }
    @Document(Description = "///This method divides the first number by the second number.///")
    private double div(double num1,double num2) {
        return num1 / num2;
    }
    @Document(Description = "This method multiplies the first number by the second number.")
    private double mul(double num1,double num2) {
        return num1 * num2;
    }
    @Document(Description = "This method adds the first number to the second number.")
    private double sub(double num1,double num2) {
        return num1 - num2;
    }
    @Document(Description = "This method subtracts the first number from the second number.")
    private double add(double num1,double num2) {
        return num1 + num2;
    }
    @Document
    private void help(){
        System.out.println(".Summation => /sum\n" +
                ".Subtraction => /sub\n" +
                ".Multiplication => /mul\n" +
                ".Division => /div");
    }
}
