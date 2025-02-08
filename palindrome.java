import java.util.*;
public class palindrome {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        System.out.println(palin(num));
        sc.close();
    }

    public static boolean palin( int a){
        int number = a;
        int rev = 0;
        while(number !=0){
            int rem = number%10;
            rev = rev*10 +rem;
            number = number/10;
        }
        if (a == rev){
            return true;
        }else{
            return false;
        }
    }
}
