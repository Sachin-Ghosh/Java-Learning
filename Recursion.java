import java.util.ArrayList;

class Recursion {
    public static void main(String[] args) {
        int n=4;
        long p=12;
        print();
        printnos(n);
        string(n);
        sumOfSeries(p);
        factorialNumbers(p);
    }
    static int cnt = 0;
    static void print(){
         if(cnt == 3 ) return;
         System.out.println(cnt);

         cnt = cnt+1;
         print();
    }
    static void printnos(int n){
        if(cnt > n ) return;
        System.out.print(n +" ");

        n = n-1;
        printnos(n);
    }
    static void string(int n){
        if(n == 0) return;
        System.out.println("Sachin");
        string(n-1);
        }
    static long sumOfSeries(long p) {
            long x = (p * (p + 1) / 2);
            return x * x;
        }
    static ArrayList<Long> factorialNumbers(long p) {
        // code here
       ArrayList<Long> result = new ArrayList<>();
        long fact = 1;
        int i = 1;

        while (fact <= p) {
            result.add(fact);
            i++;
            fact *= i;
        }
        
        return result;
    }
}