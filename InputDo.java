import java.util.*;
public class InputDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        do{
            System.out.println("enter the number: ");
            int n = sc.nextInt();
            if(n%10==0){
                System.out.println(n);
                break;
            }
            


        }while(true);
        System.out.println("out of loop: ");
        sc.close();
    }

}
