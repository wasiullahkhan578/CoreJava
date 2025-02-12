public class SelectionSort {
    public static void selection( int num[]){
        for( int i=0; i<num.length-1; i++){
            int minPos = i;
            for( int j=i+1; j<num.length; j++){
                if(num[minPos] > num[j]){
                    minPos=j;
                }
            }
            //swap
            int temp = num[minPos];
            num[minPos] = num[i];
            num[i] = temp; 
        }
    }

    public static void main(String[] args) {
        int num [] = {5,9,8,3,2};
        selection(num);
        print(num);
    }

    public static void print(int num []){
        for (int i=0; i<num.length; i++){
            System.out.print( num[i] + "");
        }
        System.out.println();
    }
}
