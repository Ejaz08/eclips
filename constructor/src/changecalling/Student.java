package changecalling;

public class Student 
{
	int id;
	String name;
	int age;
	char gender;
	
	Student()
	{
		
	}
	Student(int id)
	{
		this();
		this.id=id;
	}
	Student (int id, String name)
	{
		this(id);
	//this.id=id;
		this.name=name;	
	}
	Student (int id , String name, int age)
	{
		this(id,name);
	//	this.id=id;
	//	this.name=name;	
		this.age=age;	
	}
	Student(int id, String name, int age, char gender)
	{
		this(id,name,age);
		//this.id=id;
	//	this.name=name;	
	//	this.age=age;
		this.gender=gender;
	}
	void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
	}
	public static void main(String[] args) 
	{
		Student s= new Student(1,"abc",20,'M');
		s.display();
	}
	
}
	
