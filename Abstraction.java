public class Abstraction {
    public static void main(String[] args) {
        Chicken c = new Chicken();
        c.eat();
        c.walk();
        
        Horse h = new Horse();
        h.eat();
        h.walk();  
          
        
        Mustang myHorse = new Mustang(); // constructor called  - animal-> horse-> mustang
    }
}
abstract class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor celled..");
    }
    void eat (){
        System.out.println("animal eats..");
    }
    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("horse constructor called ..");
    }

    void changeColor(){
        color = "black";
    }

    void walk(){
        System.out.println("horse walks on 4 leg.");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor is called..");
    }
    
}

class Chicken extends Animal{
    void walk(){
        System.out.println(" chicken walks on 2 leg.");
    }
    void changeColor(){
        color = "white";
    }

}
