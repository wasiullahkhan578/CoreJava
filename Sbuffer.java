public class Sbuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(" farhan"); // it is also a class, 
        System.out.println(sb.capacity());// bydefault it gives the spae of 16 bytes that means 16 characters,
        System.out.println(sb.length());// it prints the length of the user input string size
        sb.append(" khan"); // concat the string
        sb.insert(0, "md"); // add more char at particular space
        System.out.println(sb);

    }
}
