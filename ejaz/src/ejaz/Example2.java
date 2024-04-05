package ejaz;

public class Example2 {

	public static void main(String[] args) 
{
		//wideing-- to covert smaller datatype to larger datatype
		int a=1000000;        
		float b=a;
		System.out.println(b);
		
		char c='Z';                
		double d=c;
		System.out.println(d);
		
		//Narrowing-- to convert larger to smaller datatype
		int e=65;
		char f=(char)e;
		System.out.println(f);
		
		float g=90.0f;
		char h=(char)g;
		System.out.println(h);
		

}
}
