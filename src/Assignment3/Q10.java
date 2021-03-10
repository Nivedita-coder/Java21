package Assignment3;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = input.nextLine();
        replace(str);
    }

    private static void replace(String str) {
        for (int i = 0; i < str.length(); i++) {
            if ( i% 2 == 0){
                System.out.println((char) ((str.charAt(i)+1)));
            }else
                System.out.println((char)((str.charAt(i)-1)));
            
        }

    }
}
