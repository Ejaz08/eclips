package constructor;

public class Student 
{
	static int age=23;
	static double height=5.11;
		   double weight=63.5;
		   long mobno=7077633380l;
		   
	static void name()
	{
		System.out.println("Ejaz Ahmed");
	}
	void lastname()
	{
		
		System.out.println("Khan");
	}
	public static void main(String[] args) 
	{
		System.out.println(Student.age);
		System.out.println(Student.height);
		Student.name();
		
		Student S=new Student();
		S.lastname();
		System.out.println(S.weight);
		System.out.println(S.mobno);
		
	}
}
