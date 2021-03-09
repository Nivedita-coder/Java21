package Asssignment2;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        reverse();




    }

    private static void reverse() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int number = input.nextInt();
        int reversed = 0;

        while(number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;

        }
        System.out.println("Reversed number: " + reversed);


    }

}
