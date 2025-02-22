public class Inheritence{
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eat();
        shark.swimming();

    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("eating....");
    }
    void breath(){
        System.out.println("breathing...");
    }
}
class Fish extends Animal{
    int fins;
    void swimming(){
        System.out.println("swimming...");
    }
}