public class BitAssignment {
    public static void main(String[] args) {
        int x=3 , y=5;
        x= x^y;
        y=x^y;
        x=x^y;
        System.out.println(x);
        System.out.println(y);

    }
}
