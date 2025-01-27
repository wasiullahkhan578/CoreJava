import java.util.*;
public class calSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first value: ");
        int a = sc.nextInt();
        System.out.println("Enter second value: ");
        int b = sc.nextInt();
        System.out.println("Enter operator: ");
        char operator = sc.next().charAt(0);
        switch (operator){
            case '+' ->System.out.println(a+b);
            case '-' ->System.out.println(a-b);
            case '*' ->System.out.println(a*b);
            case '/' ->System.out.println(a/b);
            case '%' ->System.out.println(a%b);
            default ->System.out.println("wrong operator...");
        }
        sc.close();
    }
  

}
