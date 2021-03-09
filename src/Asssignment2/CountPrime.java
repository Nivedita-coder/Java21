package Asssignment2;

public class CountPrime {
    public static void main(String[] args) {
        int c =1;
        int [] n = {2,3,5,6,7,39};
        for (int i = 0; i < n.length; i++) {

        }
        for (int i = 0; i*i < n.length; i++) {
            if (n[i]%2 == 1){
                c++;
            }

        }
        System.out.println(c);
    }
}
