package practice;

public class Solution 
{
	public static void printPattern(int n)
    {      
		int i, j;
        int num = 1;
        // outer loop to hand
        le number of rows
        for (i = 1; i <= n; i++) 
        {
            // inner loop to handle number of columns
            for (j = 1; j <= i; j++) 
            {
                // printing value of num in each iteration.
                System.out.print(num + " ");
                // increasing the value of num.
                num++;
            }
            
        }   
    }
}

