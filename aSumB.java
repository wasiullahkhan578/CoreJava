import java.util.*;
public class aSumB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number a: ");
        int a = sc.nextInt();
        System.out.println("Enter your second number b: ");
        int b = sc.nextInt();
        System.out.println("Sum of a and b is: ");
        int result = a+b;
        System.out.println(result);
        sc.close();
    }
}
