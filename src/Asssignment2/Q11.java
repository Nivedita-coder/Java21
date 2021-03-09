package Asssignment2;

import java.util.Arrays;

public class Q11 {
    public static void main(String[] args) {
        int [] n = {1,0,1,1,0,0,1,0,0};
        bubbleSort(n);
        System.out.println(Arrays.toString(n));
    }

    private static void bubbleSort(int[] n) {
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length-i-1; j++) {
                if (n[j]>n[j+1]){
                    swap(n,j,j+1);
                }

            }

        }
    }

    private static void swap(int[] n, int i, int j) {
        int t = n[i];
        n[i] = n[j];
        n[j] = t;
    }
}
