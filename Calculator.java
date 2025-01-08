//WAP a program to in which you have to enter 2 number , 
//display menu for user in which ask user to  which operations to peform. using switch case.

import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        // Display menu
        System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        int choice = sc.nextInt();

        // Perform operation
        switch (choice) {
            case 1:
                System.out.println("Result is " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result is " + (num1 - num2));
                break;
            case 3:
                System.out.println("Result is " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Result is " + ( num1 / num2));
                } else {
                    System.out.println("Error: Division by zero.");
                }
                break;
            
        }

        sc.close();
    }
}
        