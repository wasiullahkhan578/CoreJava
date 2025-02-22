public class InheritanceHybrid {
    public static void main(String[] args) {
      Dog doggy = new Dog();
      doggy.bark();
      doggy.breath();  
      Mammal goat = new Mammal();
      goat.walk();
      goat.breath();
      Peacock pea = new Peacock();
      pea.fly();
      pea.dance();
      Shark sh = new Shark();
      sh.attack();
    }
}
class Animal{
    String color;
    void eat() {
        System.out.println("Eating...");
    }
    void breath(){
        System.out.println("Breathing...");
    }
}
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swimming...");
    }
}
class Tuna extends Fish{
    void tuna(){
        System.out.println(" Tuna is here...");
    }
}
class Shark extends Fish{
    void attack(){
        System.out.println("Shark is attacking...");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("Flying...");
    }
}
class Peacock extends Bird{
    void dance(){
        System.out.println("Dancing...");
    }
}
class Mammal extends Animal{
    void walk(){
        System.out.println("Walking...");
    }
}
class Dog extends Mammal{
    void bark(){
        System.out.println("Barking...");
    }
}








