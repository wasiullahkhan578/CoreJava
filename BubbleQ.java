public class BubbleQ {
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

    public static void Sort(int num []){
        for(int i=0; i< num.length -1; i++){
            for(int j=0; j<num.length -1-i; j++){
                if(num[j] <num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
    }
}
