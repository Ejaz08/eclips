package method;
				//without RT and without FA
public class A {
        public static void add()
	 {
		A.sub();
		System.out.println(10+20);
	 }
        public static void mul()
        {
        	A.add();
        	System.out.println(10*5);
        }
        public static void main(String[] args) 
        {
			A.mul();
		}
        public static void sub()
        {
        	System.out.println(10-5);
        }
}
