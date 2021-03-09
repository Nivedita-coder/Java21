package Asssignment2;

public class Count {
    public static void main(String[] args) {

        int [] n = {5,45,23,63,27,80,15,2,65,30};
        int c = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i]%5 == 0){
                c++;
            }

        }
        System.out.println(c);

    }
}
