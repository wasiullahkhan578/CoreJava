public class Abstraction {
    public static void main(String[] args) {
        Chicken c = new Chicken();
        c.eat();
        c.walk();
        Horse h = new Horse();
        h.eat();
        h.walk();        
    }
}
abstract class Animal{
    void eat (){
        System.out.println("animal eats..");
    }
    abstract void walk();
}

class Horse extends Animal{
    void walk(){
        System.out.println("horse walks on 4 leg.");
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println(" chicken walks on 2 leg.");
    }
}
