package Asssignment2;
import java.util.Scanner;


public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the n1:");
        int n1 = input.nextInt();
        System.out.println("Enter the n2:");
        int n2 = input.nextInt();

        while (n1!=n2){
            if(n1>n2){
                n1-=n2;
            }else
                n2-=n1;
        }
        System.out.println("GCD :" + n1);


    }
}
