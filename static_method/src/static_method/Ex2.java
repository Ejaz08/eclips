package static_method;

public class Ex2 
{
		public static void add()
		{
			Ex2.sub();
			Ex2.mul();
			Ex2.div();
			System.out.println(10+20);
		}
		public static void sub()
		{
			System.out.println(10-5);
		}
		public static void mul()
		{
			System.out.println(10*5);
		}
		public static void div()
		{
			System.out.println(10/5);
		}
		public static void main(String[] args) 
		{
			System.out.println("START");
			Ex2.add();
			System.out.println("END");
		}
}
