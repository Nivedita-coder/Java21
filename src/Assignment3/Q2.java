package Assignment3;

public class Q2 {
    public static void main(String[] args) {
        int[][] arr = {{11,12,13,14},
                {21,22,23,24},
                {31,32,33,34},
                {41,42,43,44}};
        rowBy(arr);
    }

    private static void rowBy(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < row; i++) {
            if (i%2==0){
                for (int j = 0; j < col; j++) {
                    System.out.println(arr[i][j]+"");

                }

            }else{
                for (int j = row-1; j >=0 ; j--) {
                    System.out.println(arr[i][j]+"");

                }
            }
        }
    }
}

