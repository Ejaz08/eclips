package hybrid_eg_5;

public class Sec2 extends Std1
{
int no=29;
	
	void display1()
	{
		System.out.println("no of students in sec2");
	}
	public static void main(String[] args) {
		
		Sec2 s2=new Sec2();
		
		System.out.println(s2.std);
		s2.school();
		
		System.out.println(s2.sec);
		s2.student1();
		
		System.out.println(s2.no);
		s2.display1();
}
}