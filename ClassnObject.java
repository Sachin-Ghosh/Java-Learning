public class ClassnObject {
    public static void main(String[] args) {
        int n1 = 5 ;
        int n2 = 10 ;

        Calculator calc = new Calculator();
        int result = calc.add(n1,n2);   
        int result2 = calc.sub(n1,n2);   
        int result3 = calc.mul(n1,n2);

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    
}
}

class Calculator{
    int a;

    public int add(int n1,int n2){
        int r = n1 + n2 ;
        return r ;
    }
    public int sub(int n1,int n2){
        int p = n1 - n2 ;
        return p ;
    }
    public int mul(int n1,int n2){
        int q = n1 * n2 ;
        return q ;
    }


}