public class Sum2D {
    public static void main(String args[]){
        int num [][] = {{1,4,9},{11,4,3},{2,2,3}};
        System.out.println("Total sum of the second drow is : " +sum(num));

    }
    public static int sum(int num [][]){
        int total =0;
        
            for(int j=0; j<num[0].length; j++){
                total += num[1][j]; 
            }
        
        return total;
    }
}
