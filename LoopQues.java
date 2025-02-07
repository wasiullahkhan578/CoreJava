import java.util.*;
public class LoopQues{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;
        int choice;
        int number;
        do{
            System.out.println("Enter the number: ");
            number = sc.nextInt();
            if(number %2 ==0){
                evenSum += number;
            }else{
                oddSum += number;
            }
            System.out.println("if you want to continue press 1 or press 0: ");
            choice = sc.nextInt();
        }while(choice == 1);
        System.out.println("your even sum is : "+evenSum);
        System.out.println("your odd sum is : "+oddSum);
        sc.close();
    }
}