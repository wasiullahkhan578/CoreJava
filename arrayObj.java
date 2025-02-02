class Student{
    String name;
    int rollno;
    int mark;
}
public class arrayObj {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.name = "farhan";
        s1.rollno = 11;
        s1.mark = 111;

        Student s2 = new Student();
        s2.name = "wasi";
        s2.rollno = 22;
        s2.mark = 222;

        Student s3 = new Student();
        s3.name = "prem";
        s3.rollno = 33;
        s3.mark =333;

        Student students [] = new Student[3];
        students [0] = s1;
        students [1] = s2;
        students [2] = s3;

        for (int i=0; i<students.length; i++){
            System.out.println( students[i].name +":" + students[i].rollno + ":" + students[i].mark + ".");
        }
    }
}
