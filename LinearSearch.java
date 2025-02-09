import java.util.*;
public class LinearSearch{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println(" enter the size of the arrays: ");
        int n = sc.nextInt();
        int number [] = new int[n];


        for(int i=0; i<n; i++){
            number[i] = sc.nextInt();
        }

        System.out.println("enter the number you are looking for: ");
        int key = sc.nextInt();

        for( int i=0; i<n; i++){
            if(number[i] == key){
                System.out.println("key is found at: "+i);
            }
        }
        sc.close();

    }
}