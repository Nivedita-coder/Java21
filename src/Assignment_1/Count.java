package Assignment_1;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number:");
        int number = input.nextInt();
        int  count = 0;

        while(number!=0){
            number /= 10;
            ++count;


        }
        System.out.println("Number of digits:" + count);




    }
}
