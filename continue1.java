public class continue1 {
    public static void main(String args[]){
        int i;
        for(i=1; i<=10; i++){
            if(i==5)
                continue;
            else
                System.out.println(i);
        }

        for(i=1; i<=10; i++){
            if(i==5)
                break;
                System.out.println(i);
        }
    }
}
