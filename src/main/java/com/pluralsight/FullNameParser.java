package com.pluralsight;


import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
                 Please choose how to enter your name:
                 1. First and Last name
                 2. First, middle, and last name
                """);
        byte command = input.nextByte();
        input.nextLine();
        if (command == 1) {
            System.out.print("Please enter your full name: ");
            String fullName = input.nextLine();
            fullName = fullName.trim();
            int spacePosition = fullName.indexOf(" ");
            String firstName = fullName.substring(0, spacePosition);
            String lastName = fullName.substring(spacePosition + 1);

            System.out.printf("First name: %s%n", firstName.substring(0, 1).toUpperCase() + firstName.substring(1));
            System.out.println("Middle:(none)");
            System.out.printf("Last name: %s", lastName.substring(0, 1).toUpperCase() + lastName.substring(1));
        } else if (command == 2) {

            System.out.print("Please enter your full name: ");
            String fullMiddleName = input.nextLine();
            fullMiddleName = fullMiddleName.trim();
            String[] names = fullMiddleName.split(" ");
            String first = names[0].substring(0, 1).toUpperCase() + names[0].substring(1);
            String middle = names[1].substring(0, 1).toUpperCase() + names[1].substring(1);
            String last = names[2].substring(0, 1).toUpperCase() + names[2].substring(1);

            System.out.printf("First name: %s%n", first);
            System.out.printf("Middle name: %s%n", middle);
            System.out.printf("Last name: %s", last);
        }


    }


}
