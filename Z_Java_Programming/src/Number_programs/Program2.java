package Number_programs;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Starting Range");
		
		int start=sc.nextInt();
		System.out.println("Enter the Ending Range");
		int end= sc.nextInt();
		
		for(int i=start;i<=end;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}

	
}
