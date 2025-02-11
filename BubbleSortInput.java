import java.util.*;
public class BubbleSortInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println(" Enter the size of the array: ");
        int size = sc.nextInt();
        int num[] = new int [size];
        System.out.println("Enter the unsorted array : ");
        for(int i=0; i<size; i++){
            num[i] = sc.nextInt();
        }
        bubble(num);

        System.out.println("Sorted array in ascending order: ");
        print(num);
        
        sc.close();
    }    

    public static void print(int num []){
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
    }

    public static void bubble( int num[]){
        for( int i=0; i<num.length-1;i++){
            
            for(int j=0; j<num.length-1-i; j++){
                if( num[j]  > num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
    }
}
