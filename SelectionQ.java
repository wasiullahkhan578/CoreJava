public class SelectionQ {
    public static void main (String [] args){
        int num [] = {3,6,2,1,8,7,4,5,3,1};
        Sort(num);
        Print (num);
    }
    public static void Print(int num []){
        for(int i=0; i< num.length; i++){
            System.out.print(num[i]+ " ");
        }
        System.out.println();
    }

    public static void Sort(int num[]){
        for(int i=0; i<num.length; i++){
            int min= i;
            for(int j=i+1; j<num.length; j++){
                if(num[min] < num[j]){
                    min = j;
                }
            }

            //swap
            int temp = num[min];
            num [min] = num[i];
            num[i] = temp;
        }
    }
}
