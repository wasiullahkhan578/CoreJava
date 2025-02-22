public class InheritanceMulti {
    public static void main ( String args []){
        Dog doggy = new Dog();
        doggy.eat();
        doggy.leg = 4;
        System.out.println(doggy.leg);
    }
}
class Animal{
    String color;
    void eat(){
        System.out.println(" Eating...");
    }
    void breath(){
        System.out.println("Breathing....");
    }
}
class Mammal extends Animal{
    int leg;

}
class Dog extends Mammal{
    String name;
}
