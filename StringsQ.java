import java.util.*;
public class StringsQ{
   public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    System.out.println(" Enter your string: ");
    String str = sc.nextLine();
    vowel(str);
    sc.close();
   } 

   public static void vowel(String str){
        int count=0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u'){
                count ++;
            }
        }
        System.out.println("vowel are : "+ count);
   }
}