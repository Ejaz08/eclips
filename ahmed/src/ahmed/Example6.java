package ahmed;

public class Example6 {

	public static void main(String[] args) {
//write a java program to create a class name requirement
//select a candidate whoes passout yr is 2020-23 and who has
//70% in degree

		double degree=70;
		int yr=2020;
		if(yr<=2023 && yr>=2020)
		{
			if(degree>=70)
			{
				System.out.println("eligible");
			}
			else
			{
				System.out.println("not eligible");
			}
		}
		else
		{
			System.out.println("passout year not matched");
		}
	}

}
