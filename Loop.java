 class Loop {
    public static void main(String[] args) {
        // int i = 0;
        // while(i<=4){
        //     System.out.println("Hello World" + i);
        //     i++;
        // }
        // System.out.println("Hello");
        
        

        // int i = 5;
        // do {
        //     System.out.println("Hello World " + i);
        //     i++;
        //     } while(i <= 4);


        // int i = 0;
        // for(i=0;i<4;i++){
        //     System.out.println("Hello World");
        // }

        
        //* Nested Loop */
        // String[] daysofWeek = {
        //     "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        // };

        // int i = 0;

        // while(i<daysofWeek.length){
        //     System.out.println(daysofWeek[i]);
            
        //     int hour = 0;
        //     while(hour < 24){
        //         System.out.println("Hour: " + hour);
        //         hour++;
        // }

        // i++;
        
        for(int i = 1;i<=5;i++){
            System.out.println("Day " + i);

            for(int j = 9;j<=17;j++){
                System.out.println("Hour: " + j);
            }
        }
    }
    
}
