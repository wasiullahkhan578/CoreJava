import java.util.*;     
public class LSearch {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println ("enter the size of the array: ");
        int size = sc.nextInt();
        int num [] = new int [size];
        System.out.println(" enter the elements of the array: ");
        for(int i=0; i<size; i++){
            num[i] = sc.nextInt();
        }

        // print array
        for(int i=0; i< size; i++){
            System.out.print(num[i]+ " ");

        }
        System.out.println(" please enter your key to find in the array: ");
        int key = sc.nextInt();

        int result = Linear(num, key);
        if(result != -1){
            System.out.println("your key found at :  "+result);
        }else{
                System.out.println("not in array..");
        }
    

        sc.close();
    }
    public static int Linear( int num [], int key){
        for(int i=0; i<num.length; i++){
            if(num[i] == key){
                return i;
            }
        }
        return -1;
    }
}
