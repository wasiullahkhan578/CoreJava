public class OOPS {
    
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.println(p1.color);

        p1.setTIP(5);
        System.out.println(p1.tip);
    }
}

class Pen{
    String color;
    int tip;
    void setTIP(int newTip ){
        tip = newTip;
    }
    void setColor(String newColor){
        color = newColor;
    }
}
