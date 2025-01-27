import java.util.*;
public class typeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num = sc.nextInt();  // here int is converted to float  where destination type is greater then the source type
        System.out.println(num);
        sc.close();
    }
}
