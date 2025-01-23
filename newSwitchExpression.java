class newSwitchExpression {
    public static void main(String[] args) {
        String day = "sun";
        String result = "";
        result = switch(day){
            case "sat" , "sun" -> "6 am";
            case "mon" -> "8 am";
            default -> "7 am";
        };
        System.out.printf(result);
    }
}