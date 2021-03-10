package Assignment3;

public class Q11 {
    public static void main(String[] args) {
        String s = "abcDEasw";
        toggle(s);
    }

    private static void toggle(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)>=65 && s.charAt(i)<=90){
                System.out.print((char) (s.charAt(i)+32));
            }else if (s.charAt(i) >= 97 && s.charAt(i) <= 122){
                System.out.print((char) (s.charAt(i) - 32));
            }else
                System.out.println("wrong");

        }
    }
}
