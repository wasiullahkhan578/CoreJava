public class binomialC {
    public static int factorial( int a){
        int f= 1;
        for( int i=1; i<=a; i++){
            f=f*i;
        }
        return f;
    }
    public static int biC( int n, int r){
        int NFact = factorial(n);
        int RFact = factorial(r);
        int NRFact = factorial(n-r);
        int biC = NFact / (RFact * NRFact);
        return biC; 
    }
    public static void main(String[] args) {
        System.out.println(biC(8, 05));
    }
}
