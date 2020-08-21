package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello there!");
        Scanner scanner = new Scanner(System.in);
        String reply = scanner.nextLine();
        if (reply.equalsIgnoreCase("general kenobi") || reply.equalsIgnoreCase("general kenobi!")) {
            System.out.println("You are strong and wise and I am very proud of you.");}
        else {
            System.out.println("It's treason, then.");

        }
    }
}
