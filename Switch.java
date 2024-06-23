class Switch {
    public static void main(String[] args) {
        // int n = 7;
        // switch (n) {
        //     case 1: System.out.println("Monday"); break;
        //     case 2: System.out.println("Tuesday"); break;
        //     case 3: System.out.println("Wednesday"); break;
        //     case 4: System.out.println("Thursday"); break;
        //     case 5: System.out.println("Friday"); break;
        //     case 6: System.out.println("Saturday"); break;
        //     case 7: System.out.println("Sunday"); break;
        //     default: System.out.println("Invalid day");
        // }

        String day = "Monday";
        String result = "";

        switch(day){
            case "Monday","Thursday" -> result = "2";
            case "Tuesday" -> result = "3";
            default -> result = "1";
        }


        // result = switch(day){
        //     case "Monday","Thursday" -> "2";
        //     case "Tuesday" ->  "3";
        //     default -> "1";
        // };

        // result = switch(day){
        //     case "Monday","Thursday" : yield  "2";
        //     case "Tuesday" : yield  "3";
        //     default : yield "1";
        // };

        System.err.println(result);
    
}
}
