package Assignment3;

public class Q5 {
    public static void main(String[] args) {
        int[][]nums = {{11,12,13,14},
                {21,22,23,24},
                {31,32,33,34},
                {41,42,43,44}};
        rotation(nums);
        //System.out.println(rotation(nums));
    }

    private static void rotation(int[][] nums) {
        int rows = nums.length;
        int cols = nums[0].length;
        //defining the boundaries of the matrix.
        int top = 0, bottom = rows-1,left = 0,right = cols-1;

        //defining the direction in which the array traversed.
        int dir = 1;

        while(top<=bottom && left <= right){
            if(dir==1){ //moving->right
                for (int i = left; i <= right ; i++) {
                    System.out.println(nums[top][i]+"");
                }
                //since we have traversed the whole first
                //row,move down the first row;
                top++;
                dir = 2;
            }
            else if(dir == 2){
                for (int i = top; i <= bottom; i++) {
                    System.out.println(nums[i][right]+"");

                }
                right--;
                dir = 3;
            }
            else if(dir==3){
                for (int i = right; i >=left ; i--) {
                    System.out.println(nums[bottom][i]+"");

                }
                bottom--;
                dir=4;
            }
            else if (dir==4){
                for (int i = bottom; i >= top; i--) {
                    System.out.println(nums[i][left]+"");

                }
                ++left;
                dir=1;
            }
        }
        
    }
}
