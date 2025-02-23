public class MultipleInheritance {
    public static void main(String[] args) {
        Shark sh = new Shark();
        sh.walk();
        sh.think();
    }
}
interface Animal{
    void walk();
}
interface Human{
    void think();
}
class Shark implements Animal, Human{
   public void walk(){
        System.out.println("walk on land");
    }
    public void think(){
        System.out.println("shark can think");
    }
}
