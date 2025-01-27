import java.util.*;
public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your first number");
        int first = sc.nextInt();
        System.out.println("Enter your second number");
        int second = sc.nextInt();
        System.out.println("Enter your third number");
        int third = sc.nextInt();
        int largest = 0;
        if(first>second && first > third){
            largest = first;
        }else if(second>first && second > third){
            largest = second;
        }else{
            largest = third;
        }
        System.out.println("The largest number is : "+ largest);
        sc.close();
    }
}
