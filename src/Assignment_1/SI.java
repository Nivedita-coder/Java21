package Assignment_1;

import java.util.Scanner;

public class SI {
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);

        System.out.print("Enter the principal:");
        double principle = input.nextDouble();

        System.out.println("Enter the rate:");
        double rate = input.nextDouble();
        rate = rate/100;

        System.out.println("Enter the time:");
        double time = input.nextDouble();

        double interest = (principle*rate*time) / 100;

        System.out.println("Principal"+principle);
        System.out.println("Interest Rate:"+rate);
        System.out.println("Simple Interest:"+interest);

        input.close();

    }
}
