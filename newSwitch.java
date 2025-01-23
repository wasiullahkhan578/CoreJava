class newSwitch {
    public static void main(String[] args) {
        String day = "monday";
        switch(day){
            case "saturday" , "sunday" -> System.out.print("6 am");
            case "monday" -> System.out.print("8 am");
            default -> System.out.print("7 am");
        }
    }
}