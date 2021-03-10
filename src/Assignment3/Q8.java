package Assignment3;

public class Q8 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 1, 2, 4, 1};
        int[] arr2 = {2, 1, 3, 1, 5, 2, 2};

        intersection(arr1, arr2);
        //System.out.println(intersection(arr2[j]););

    }

    private static void intersection(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr2[j]);


                }

            }

        }


    }
}
