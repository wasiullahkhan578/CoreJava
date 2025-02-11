import java.util.*;
public class BSearch {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your size of the array: ");
        int size = sc.nextInt();
        int num [] = new int [size];
        for(int i=0; i<size; i++){
            num[i] = sc.nextInt();
        }
        System.out.println("enter the key to found: ");
        int key = sc.nextInt();
        int result = binary(num, key);
        if(result!= -1){
            System.out.println("key found at: "+ result);
        }else{
            System.out.println(" key is not in array..");
        }
        sc.close();
    }

    public static int binary(int num[], int key){
        int start = 0;
        int end = num.length-1;
        while(start<= end){
            int mid = (start + end)/2;
            if (num[mid] == key){// found
                return mid;
            }else if(num[mid] < key){ // right
                start = mid+1;
            }else  {//left
                end = mid-1;
            }
            
        }
        return -1;
    }
}
