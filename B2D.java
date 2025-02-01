public class B2D {
    public static void bi2de ( int BNum){
        int pow = 0;
        int dec = 0;
        while(BNum >0){
            int lastD = BNum %10;
            dec = dec +(lastD * (int)Math.pow(2,pow));
            pow ++;
            BNum = BNum /10;
        }
        System.out.println(dec);
    }
    public static void main(String[] args) {
        bi2de(1011);
    }
}
