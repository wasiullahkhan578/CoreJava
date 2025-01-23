class calculator {
    int a; // what object knows data
    public int add( int n1, int n2){ // what object does / method
        int r = n1+ n2;
        return r;
    }
}
public class class1 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 8;
        calculator calc = new calculator(); // objects creted by jvm
        int result = calc.add(num1 , num2); // calling the method
        System.out.println(result);
    }
}
