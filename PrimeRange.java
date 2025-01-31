public class PrimeRange {
    public static boolean prime(int n){
        if(n<2){
            return false;   // 0 and 1 is not prime number;
        }
        if(n==2){
            return true;   // 2 is a prime number;
        }
        if(n%2 == 0){
            return false;  // except 2 no even number can be the prime number;
        }
        for( int i = 3; i<=Math.sqrt(n); i +=2){  // i starts from 3 and increment of 2 because of no even number
            if( n%i == 0){
                return false;
            }
        }
        return true;
    }    

    public static void primeInRange( int n){
        for( int i=1; i<=n; i++){
            if(prime(i)){
                System.out.print( i + " ");
            }
        }
    }
    public static void main (String args []){
        primeInRange(3000);
    }
}
