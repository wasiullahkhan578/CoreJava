public class Clear {
    public static int clear(int n, int i){
        int bitMask = ~(1<<i);
        return n&bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clear(10, 01 ));
    }
}
