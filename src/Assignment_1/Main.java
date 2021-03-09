package Assignment_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a credit");
        int credit = reader.nextInt();

        if(credit >= 7500) {
            System.out.println("Tera leader");
        }
        else if(6000 <= credit && credit < 7500) {
            System.out.println("Gega Leader");
        }
        else if ( 4500 <= credit && credit< 6000){
            System.out.println("Mega");
        }
        else {
            System.out.println("Rising Star");
        }


    }





}
