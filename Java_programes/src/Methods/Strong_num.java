package Methods;

import java.util.Scanner;

public class Strong_num {

	public static void main(String[] args) {
		Strong obj=new Strong();
		obj.strong_range();

	}

}
class Strong
{
	int fact(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
		
	}
	void strong_range()
	{
		Scanner sc=new Scanner(System.in);
		int start,end,sum=0,rem=0;
		System.out.println("Enter values of start and end:-");
		start=sc.nextInt();
		end=sc.nextInt();
		for(int i=start;i<=end;i++)
		{
			int Fact=1;sum=0;
			for(int j=i;j>0;j/=10)
			{
				rem=j%10;
				Fact=fact(rem);
				sum=sum+Fact;
			}
			if(sum==i)
				System.out.println(i);
		}
	}	
}
