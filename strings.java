public class strings{
    public static void main(String[] args) {
        String name = new String("farhan"); // string is actually is a class..
        System.out.println(name);
        System.out.println(name.concat(" khan"));
        String name1 = "wasiullah khan"; // however we can directly assign the value  and java automatically create a object of it.
        System.out.println(name1);


        String s1 = "farhan";
        String s2 = "farhan";
        System.out.println(s1 == s2);// true because both variable hold the same data it is not obtain new space in the heap memory because of string constant pool
    }
}