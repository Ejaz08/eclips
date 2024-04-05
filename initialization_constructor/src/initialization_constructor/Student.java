package initialization_constructor;

public class Student 
{
	int id;
	String name;
	
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public static void main(String[] args) 
	{
		Student s=new Student(1,"raju");
		Student s1=new Student(2,"bheem");
		Student s2=new Student(3,"ejaz");
		Student s3=new Student(4,"karan");
		Student s4=new Student(5,"raja");
		Student s5=new Student(6,"bhaijaan");
		
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s3.id);
		System.out.println(s3.name);
		System.out.println(s4.id);
		System.out.println(s4.name);
		System.out.println(s5.id);
		System.out.println(s5.name);
				
	}
}
