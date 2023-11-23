package Methods;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		pallin_range obj=new pallin_range();
		obj.pallin_method();

	}

}
class pallin_range
{
	void pallin_method()
	{
		Scanner sc=new Scanner(System.in);
		int start,end,rev=0,rem=0;
		System.out.println("Enter values of start and end:-");
		start=sc.nextInt();
		end=sc.nextInt();
		for(int i=start;i<=end;i++)
		{
			rev=0;
			for(int j=i;j>0;j/=10)
			{
				rem=j%10;
				rev=rev*10+rem;
			}
			if(rev==i)
				System.out.println(i);
		}
	}	
}
