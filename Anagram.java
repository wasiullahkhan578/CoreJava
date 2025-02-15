import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";
        // convert to losercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        // check the length are same
        if(str1.length() == str2.length()){
            //convert string into arrys
            char str1Array [] = str1.toCharArray();
            char str2Array [] = str2.toCharArray();
            //sort the arrays
            Arrays.sort(str1Array);
            Arrays.sort(str2Array);
            // if the sorted array are same then string are anagram
            boolean result = Arrays.equals(str1Array,str2Array);
            if(result){
                System.out.println("Anagaram of each other...");
            }else{
                System.out.println("not anagram..");
            }
        }else{
            // when length are not same
            System.out.println("not anagram");
        }
    }
}