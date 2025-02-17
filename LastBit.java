public class LastBit {
    public static int last(int n, int i){
        int bitMask = ~(0)<<i;
        return n&bitMask;
    }
    public static void main(String[] args) {
        System.out.println(last(15, 02 ));
    }
}
