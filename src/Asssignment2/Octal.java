package Asssignment2;

import java.util.Scanner;

public class Octal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        int n = input.nextInt();
        // 1. method one with predefined function

        //String octalString = Integer.toOctalString(n);
        //System.out.println("Octal number :" + octalString);

        //2. through logic
        int rem;

        String str = "";
        char dig[]={'0','1','2','3','4','5','6','7'};
        while(n>0){
            rem = n%8;
            str=dig[rem]+str;
            n=n/8;
        }
        System.out.println("Decimal to octal: "+str);





    }
}
