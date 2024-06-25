public class Method {
    public static void main(String[] args) {

        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.playGame(7);
        System.out.println(str);
}
}

class Computer{

    public void playMusic(){
        System.out.println("Playing music....");
    }

    public String playGame(int time){
        if(time>=10)
        return "Playing game Esprts";
        else if(time<=5)
        return "Playing game Bgmi";
        else
        return "Studing";

    }
}



//* Method Overloading */

// class Calculator
// {
// 	public int add(int n1, int n2, int n3)
// 	{
// 		return n1+n2+n3;
// 	}
// 	public int add(int n1, int n2)
// 	{
// 		return n1+n2;
// 	}
// 	public double add(double n1, int n2)
// 	{
// 		return n1+n2;
// 	}
// }


// public class Method {
// 	public static void main(String[] args) {
// 		Calculator obj=new Calculator();
// 		int r1=obj.add(3,4);
// 		System.out.println(r1);
// 	}
// }