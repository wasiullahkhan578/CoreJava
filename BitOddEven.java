public class BitOddEven {
    public static void main(String[] args) {
        check(3);
        check(6);
    }
    public static void check(int n){
        int bitMask =1;
        if((n & bitMask) == 0){
            System.out.println("even number: ");
        }else{
            System.out.println("Odd number: ");
        }
    }
}
