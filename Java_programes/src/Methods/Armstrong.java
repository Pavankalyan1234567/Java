package Methods;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Armstrong_range obj=new Armstrong_range();
		obj.Armstrong_method();

	}

}
class Armstrong_range
{
	void Armstrong_method()
	{
		Scanner sc=new Scanner(System.in);
		int start,end,sum=0,digits=0;
		System.out.println("Enter values of start and end:-");
		start=sc.nextInt();
		end=sc.nextInt();
		for(int i=start;i<=end;i++)
		{
			sum=0;digits=0;
			int count_digits=no_Digits(i,digits);
			int result=armstrong(i,count_digits,sum);
			if(result==i)
				System.out.println(i);
		}
	}
	int no_Digits(int x,int digits)
	{
		for(int i=x;i>0;i/=10)
			digits++;
		return digits;
	}
	int armstrong(int y,int z,int sum)
	{
		int rem=0;
		for(int k=y;k>0;k/=10)
		{
			rem=k%10;
			sum=sum+power(rem,z);
		}
		return sum;
	}
	int power(int rem,int digits)
	{
		int i,mul=1;
		for(i=1;i<=digits;i++)
			mul=mul*rem;
		return mul;
	}
}

