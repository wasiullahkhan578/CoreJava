public class d2b {
    public static void decToBi (int n){
        int pow = 0;
        int bin =0;
        while (n>0){
            int rem = n%2;
            bin +=(rem * (int) Math.pow(10,pow));
            pow++;
            n= n/2;
        }
        System.out.println("binary number is :" + bin );
    }
    public static void main(String[] args){
        decToBi(10);
    }
}
