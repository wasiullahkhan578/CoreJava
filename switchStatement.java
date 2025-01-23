public class switchStatement {
    public static void main(String[] args) {
        int n = 8;
        switch (n) {
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            case 7:
                System.out.print("Sunday");
                break;            
            default:
                System.out.print("Enter A Valid Number");
                break;
        }
    }
}
