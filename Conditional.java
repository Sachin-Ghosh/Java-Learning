class Conditional {
    public static void main(String[] args) {
        // int x = 18;
        // int y = 23;

        // if(x>y) //for multiple statements use {} 
        // {
        //     System.out.println("true");
        //     System.out.println(x + "is greater than" + y);
        // }
        // else
        // {
        //     System.out.println("false");
        //     System.out.println(y + "is greater than" + x);   
        // }

        // int x = 3;
        // int y = 6;
        // int z = 9;

        // if(x>y && x>z)
        // {
        //     System.out.println("x is the greatest number");
        //     System.out.println("True");
        //     }
        // else if(y>z)
        // {
        //     System.out.println("y is the greatest number");
        //     System.out.println("True");
        //     }
        // else
        //     System.out.println("z is the greatest number");


        int n = 3;
        int result = 0;


        result = n%2==0 ? 1 : 0 ;
        if(result==1)
        System.out.println("The number is Even" );
        else
        System.out.println("The number is Odd" );
 }
}