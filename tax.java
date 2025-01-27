import java.util.*;
public class tax {
    public static void main(String[] args) {
        System.out.println("Enter your annual income : ");
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;
        if (income < 5_00_00_0){
            System.out.println("You are not eligible to pay income tax ...");
        }else if (income >= 5_00_00_0 && income <1_00_00_00){
             tax = (int) (income * 0.2);
             System.out.println("You have to pay income tax : "+ tax);
        }else{
            tax = (int) ( income * 0.3);
            System.out.println("You have to pay income tax : "+ tax);
        }
        
        sc.close();
    }
}
