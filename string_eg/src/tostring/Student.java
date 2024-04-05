package tostring;

public class Student 
{
	int id;
	
	Student(int id)
	{
		this.id=id;
	}
	
	public String toString()
	{
		return "Student [id="+id+"]";
	}
	
	public static void main(String[] args) 
	{
		Student a=new Student(1);
		System.out.println(a);

	}
}
