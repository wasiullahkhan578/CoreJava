class computer{
    public void playMusic(){
        System.out.println("Music Playing...");
    }
    public String getMePen( int cost){
        if(cost >=10)
            return "PEN";
        else
            return "NOTHING";
    }
}

public class method {
    public static void main(String srgs[]){
        computer obj = new computer();
        obj.playMusic();

        String str = obj.getMePen(12);
        System.out.println( str);
    }
    
}
