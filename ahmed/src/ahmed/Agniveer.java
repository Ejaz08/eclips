package ahmed;

public class Agniveer {

	public static void main(String[] args) {
//write a java program to create a class name agniveer exam 
//and select the candidate whose hight is 6ft and 
//age is in between 21 to 25

		
		double height=6;
		int age=25;
		if(age<=25 && age>=21)
		{
			if(height==6)
			{
				System.out.println("hight matched");
			}
			else
			{
				System.out.println("height not matched");
			}
		}
		else
		{
			System.out.println("age is not matched");
		}
}
}
