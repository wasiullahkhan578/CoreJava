public class DiagonalSum {
    public static void main(String[] args) {
        int spiral [] [] ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(sum(spiral));
    }

    public static int sum( int spiral [][]){
        int sum =0;
        for(int i=0; i<spiral.length; i++){
            //pd sum
            sum += spiral[i][i];
            //sd sum
            if(i!= spiral.length-i-1){
                sum += spiral[i][spiral.length-1-i];
            }
            
        }
        return sum;
    }
}
