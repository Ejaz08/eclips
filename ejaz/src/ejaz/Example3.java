package ejaz;

public class Example3 {

	public static void main(String[] args) 
{		
		//widening
		byte a=28;
		int b=a;
		System.out.println(b);
		
		//narrowing
		double c=68.4879;
		char d=(char)c;           //byte<short<char<int<long<float<double
		System.out.println(d);
		
		//narrowing
		float e=48;
		int f=(int)e;
		System.out.println(f);
		
		//narrowing
		short g=90;
		char h=(char)g;
		System.out.println(h);
		

}
}
