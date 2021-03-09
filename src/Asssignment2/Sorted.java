package Asssignment2;

public class Sorted {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        //System.out.println("Enter the array :");
        int[] n = {4,5,6,7,8};
        bubbleSort(n);

        System.out.println(bubbleSort(n));
    }

    private static boolean bubbleSort(int[] n) {
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length-i- 1 ; j++) {
                if (n[j] > n[j + 1]) {
                    return false;

                }


            }
        }

        return true;
    }
}