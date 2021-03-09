package Asssignment2;


import java.util.Arrays;

public class Q15 {
    public static void main(String[] args) {
        int [] n = {3, 1, 2, 9, 7, 5, -1, 6};
        sum(n);
        System.out.println(Arrays.toString(n));

    }

    private static void sum(int[] n) {
        int target = 9;
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                for (int k = 0; k < n.length; k++) {
                    if (n[i]+n[j]+n[k] == target){
                        System.out.println("("+n[i] + "," + n[j] + "," + n[k] + "," +")");
                    }
                }
            }
        }
    }
}
