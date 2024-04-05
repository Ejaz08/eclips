package array;

public class Cricketers 
{
	public static void main(String[] args) 
	{
		String [] name={"virat","dhoni","siraj","gill","jadeja","bumbraha","rohit","sami","KL rahul","surya"};
		System.out.println("players-----");
		for(int a=0;a<=9;a++)
		{
			System.out.println(name[a]);
		}
		
		System.out.println();
	
        String [] bname={"virat","dhoni","gill","rohit","KL rahul","surya"};
        System.out.println("batsman-----");
		for(int b=5;b>=0;b--)
		{
			System.out.println(bname[b]);
		}
     		System.out.println();
     		
     		String [] cname={"jadeja","bumbraha","siraj","sami"};
            System.out.println("ballers-----");
    		for(int c=3;c>=0;c--)
    		{
    			System.out.println(cname[c]);
    		}
		
      		

		
	}
	
}
