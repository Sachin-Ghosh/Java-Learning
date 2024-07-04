public class StringL {
    public static void main(String[] args) 
	{
		// String name=new String();
		// System.out.println(name);
		// System.out.println(name.hashCode());
		// System.out.println("hello "+name);
		// System.out.println(name.concat("ghosh"));
    //  String name="Sachin";
		
        // String name="sachin";
        // name=name+"ghosh";
        // System.out.println("hello"+name);
        
        // String s1="Sachin";
        // String s2="Sachin";
        
        // System.out.println(s1==s2);

        StringBuffer sb= new StringBuffer("Sachin");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append("Ghosh");
		System.out.println(sb);
		
		String str=sb.toString();
		
		// sb.deleteCharAt(2);
//		sb.insert(0,"Java");
//		sb.insert(6,"java");
//		sb.setLength(30);
		sb.ensureCapacity(100);
		
		System.out.println(sb);


	}
}
