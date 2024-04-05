package ahmed;

public class Example1 {

	public static void main(String[] args) 
{
		/*int a=10;
		int b=11;
		boolean c=a++ + b++ > --a + b++ || b++ + a-- > b--;
		System.out.println(c); */
		
	/*	int a=10;
		int b=11;
		int c=13;
		boolean d=a++ + b++ - c++ > a-- + b++ + c-- && b++ + c++ - b++ > c++ - b++;
		System.out.println(d); */
		/*int a=10;
		int b=11;
		int c=13;
		int d=14;
		boolean e=( d-- + c-- > b-- || b++ + c-- < b++) && (d-- + c++ > b++ || --d + --a < b++ + b--);
		System.out.println(e);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);*/
		
		int a=24;
		int b=26;
		int c=28;
		int d=38;
		boolean e=( a++ - b++ < b++ + c-- && b-- > c++)||(c++ + d-- > b++ || c-- + b++ > c++
				);
		System.out.println(e);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

}

}
