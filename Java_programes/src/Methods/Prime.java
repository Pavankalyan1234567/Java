package Methods;
import java.util.Scanner;
public class Prime 
{

	public static void main(String[] args) 
	{
		prime_range obj=new prime_range();
		obj.prime_method();	

	}

}
class prime_range
{
	void prime_method()
	{
		Scanner sc=new Scanner(System.in);
		int start,end,factors=0;
		System.out.println("enter values of start and end:-");
		start=sc.nextInt();
		end=sc.nextInt();
		for(;start<=end;start++)
		{
			factors=0;
			for(int i=1;i<=start;i++)
			{
				if(start%i==0)
					factors++;
			}
			if(factors==2)
				System.out.println(start);
		}
	}	
}
