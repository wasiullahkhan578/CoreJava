public class Duplicate {
    public static void main(String[] args) {
        int num [] = {1,2,6,3};
        System.out.println(dup(num));
    }    
    public static boolean dup(int num[]){
        for(int i=0; i<num.length-1; i++){
            for( int j= i+1; j<num.length; j++){
                if(num[i] == num[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
