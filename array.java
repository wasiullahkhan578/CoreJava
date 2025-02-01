import java.util.*;
public class array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n = sc.nextInt();
        int array [] = new int [n];
        System.out.println("enter the element of the array: ");
        for(int i=0; i<n; i++){
            array [i] = sc.nextInt();
        }
        System.out.println("The array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        sc.close();
        
    }
}