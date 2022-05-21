package lab_02;

public class PostfixPrefix {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        int c = ++a + b++ ;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
