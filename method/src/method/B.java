package method;
              
			//with RETURN TYPE and with ARGUMENT

public class B {
	public static int add(int a, int b) {
		
		int c=a+b;
		return c;
	}

	public static void main(String[] args) 
	{
		int a=B.add(2,3);
		System.out.println(a);	
	}

}
