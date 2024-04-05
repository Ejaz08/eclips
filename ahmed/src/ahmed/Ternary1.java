package ahmed;

public class Ternary1 {

	public static void main(String[] args) 
	{
		int age=12;
		String marriage=(age>=21)?"Eligible to marry":"Not eligible to marry";
		System.out.println(marriage);
		
		int voterage=24;
		
		String vote=(voterage>=18)? "eligible":" not eligible";
    	System.out.println(vote);
    	
    	int a=25;
    	int b=35;
    	String c= (a>b)? "a is greater":"b is greater";
    	System.out.println(c);
    	
    	//write a java program to check the number is positive or negetive
    	
    	int d=-26;
    	String e=(d>0)?"positive":"negative";
    	System.out.println(e);
    	
    	//write a java program to check the given number is even or odd
    	
    	int f=57;
    	String h=(f%2==0)? "even":"odd";
    	System.out.println(h);

}
}
