package Asssignment2;

public class Q14 {
    public static void main(String[] args) {
        int [] n = {3, 1, 11, 2, 9, 7, 4, 5, -1, 13, 6};
        sum(n);
        System.out.println(n);
    }

    private static void sum(int[] n) {
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                int target = 8;
                if (n[i] + n[j] == target){
                    System.out.println("("+ n[i] + " ," + n[j] + "" + ")");
                }
            }
        }

    }
}
