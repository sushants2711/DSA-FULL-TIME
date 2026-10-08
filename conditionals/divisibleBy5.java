package conditionals;

import java.util.Scanner;

public class divisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number that is divisible by 5: ");

        int number = sc.nextInt();

        if (number % 5 == 0) {
            System.out.println("The given number is divisible by 5 and the number is" + number);
        } else {
            System.out.println("The given number is not divisible by 5 and the number is " + number);
        }
    }
}
