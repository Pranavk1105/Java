//Wap program take imput for user for 2 number  and add them using scanner class

import java.util.Scanner;
public class inputclass {
    public static void main (String args[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter integer number");

        int i = sc.nextInt();

        System.out.println("Enter  integer number");
        int j = sc.nextInt();

        int sum = i + j;

        System.out.println("sum of interger is " + sum );
        sc.close();
    }







     

}