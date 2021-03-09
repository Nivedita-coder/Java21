package Asssignment2;


import java.util.Arrays;

public class Q12 {
    public static void main(String[] args) {
        int [] n = {3,4,6,5,8,7};
        bubbleSort(n);
        System.out.println(Arrays.toString(n));
    }

    private static void bubbleSort(int[] n) {
        int even =0;
        for (int i = 0; i < n.length; i++)
             {
                if (n[i]%2 == 0){
                    swap(n,i,even);
                    even++;
                }
            }

        }




    private static void swap(int[] n, int i, int j){
      int t = n[i];
      n[i] = n[j];
      n[j] = t;
    }

}
