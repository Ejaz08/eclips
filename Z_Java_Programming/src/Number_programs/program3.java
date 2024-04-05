package Number_programs;

import java.util.Scanner;

public class program3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the starting number");
		
		int start = sc.nextInt();
		System.out.println("enter the ending number");
		int end = sc.nextInt();
		
	int sum=0;
	for(int i=start;i<=end;i++)
	{
		if(i%2==0) {
		sum=sum+i;
		}
	}
	System.out.println(sum);
		
	}

}
