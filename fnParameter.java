import java.util.*;
public class fnParameter {

    public static int add( int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = add(a,b);
        System.out.println("the sum of the those  number is : "  +c);
        
        sc.close();
    }
}
