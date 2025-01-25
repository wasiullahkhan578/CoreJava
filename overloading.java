class calculator{
    public int add ( int n1, int n2, int n3){
        return n1+ n2+ n3;
    }
    public int add ( int n1, int n2){
        return n1+ n2;
    }
    public double add ( double n1, int n2){
        return n1+ n2;
    }

}

public class overloading {
    public static void main(String[] args) {
        calculator obj = new calculator();
        double result = obj.add(2.2222222,3);
        System.out.println(result);
    }
}