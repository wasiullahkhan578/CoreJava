public class Polymorphism {
    public static void main(String[] args) {
       Calculator calc = new Calculator();
       System.out.println(calc.sum(4,5)); 
       System.out.println(calc.sum(1,2,3));
       System.out.println(calc.sum(2.5f, 2.5f));
    }
}
class Calculator{
    int sum (int a , int b){
        return a+b;
    }
    float sum (float a, float b){
        return a+b;
    }
    int sum (int a , int b, int c){
        return a+b+c;
    }
}
