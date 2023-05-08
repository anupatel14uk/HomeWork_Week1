package Homework;

import java.util.Scanner;

public class program10 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Input first number: ");
        int first = sc.nextInt();
        System.out.print("Input second number: ");
        int second = sc.nextInt();
        System.out.println(first + " x " + second + " = " + first*second);
    }
}
