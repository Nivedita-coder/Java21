package Assignment3;

public class Q1 {
    public static void main(String[] args) {
        int [][] arr = {{11, 12 ,13 ,14},
                {21 ,22 ,23 ,24},
                {31 ,32, 33 ,34},
                {41 ,42 ,43 ,44}};
        columnBy(arr);
        //System.out.println(arr);


    }

    private static void columnBy(int[][] arr) {
        //System.out.println();
        int row=arr.length;
        int col=arr[0].length;
        for (int i = 0; i < col; i++) {
            if (i%2==0){
                for (int j = 0; j < row; j++) {
                    System.out.print(arr[j][i] +","+"");

                }

            }else {
                for (int j =row-1 ; j>=0; j--) {
                    System.out.print(arr[j][i]  +","+"");

                }
            }

        }
    }


}

