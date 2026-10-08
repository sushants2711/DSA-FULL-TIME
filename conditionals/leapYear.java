package conditionals;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("In this program we are checking the current input is the leap year or not. ");

        System.out.print("Enter the year: ");

        int year = sc.nextInt();

        if (year % 400 == 0) {
            System.out.println("The current year is leap year.");
        } else if (year % 100 == 0) {
            System.out.println("The current year is not a leap year.");
        } else if (year % 4 == 0) {
            System.out.println("The current year is leap year.");
        } else {
            System.out.println("The current year is not a leap year.");
        }
    }
}
