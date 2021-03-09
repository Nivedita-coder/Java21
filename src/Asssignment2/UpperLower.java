package Asssignment2;
import java.util.Scanner;


public class UpperLower {
    public static void main(String[] args) {

        upperLower();

    }

    private static void upperLower() {
        char character ;
        Scanner input = new Scanner(System.in);
        character = input.next().charAt(0);
        if(character>= 65 && character <= 90){
            System.out.println("Upper");
        }
        else if (character >= 97 && character <= 122){
            System.out.println("Lower");
        }
        else
            System.out.println("other");





    }


}
