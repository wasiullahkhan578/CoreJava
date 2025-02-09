import java.util.*;
public class TwoD { 
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter size of the rows: ");
        int row = sc.nextInt();
        System.out.println("Enter size of the cols: ");
        int col = sc.nextInt();

        int twoD [][] = new int [row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col;j++){
                twoD [i] [j] = sc.nextInt();
            }
        } 


        System.out.println("Enter the key to look for: ");
        int key = sc.nextInt();

        for(int i =0; i<row; i++){
            for(int j=0; j<col; j++){
                if(twoD[i] [j] == key){
                    System.out.println("your key find at index: " +i +" " +j);
                }
            }
        }
        sc.close();
    }
}
