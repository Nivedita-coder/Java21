package Assignment3;

public class Q12 {
    public static void main(String[] args) {
        String s = "acb";
        difference(s);
    }

    private static void difference(String s) {
        String result = "";
        for (int i = 0; i < s.length()-1; i++) {
            int res = s.charAt(i+1)-s.charAt(i);
            result = result+Character.toString(s.charAt(i))+res;


        }
        System.out.println(result+s.charAt(s.length()-1));
    }
}
