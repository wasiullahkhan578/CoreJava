public class LinearS {
    public static void main(String[] args) {
        int num [] = {1,2,3,4,5};
        int key = 5;
        int result = Search(num, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    
    public static int Search( int num [], int key){
        for(int i=0; i<num.length; i++){
            if( num[i] == key){
                return i;
            }
        }
        return -1;
    }
}
