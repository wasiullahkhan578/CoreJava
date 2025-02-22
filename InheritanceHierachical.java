public class InheritanceHierachical {
    public static void main(String[] args) {
        Mammal goat = new Mammal();
        goat.eat();
        goat.walk();
        Birds crow = new Birds();
        crow.breath();
        crow.fly();
        Fish shark = new Fish();
        shark.swim();
    
    }
}
class Animal{
    String color;
    void eat() {
        System.out.println("Eating...");
    }
    void breath() {
        System.out.println("Breathing...");
    }
}
class Mammal extends Animal{
    void walk(){
        System.out.println("Walking...");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("Swimming...");
    }
}
class Birds extends Animal{
    void fly(){
        System.out.println("Flying...");
    }
}
