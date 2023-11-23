package Methods;
import java.util.*;
public class Arms_prime {

	public static void main(String[] args) 
	{
		//Random sc=new Random();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of Number:-");
		int n=sc.nextInt();
		//System.out.println(n);
		Armsprime ap=new Armsprime();
		ap.prime(n);

	}

}
class Armsprime
{
	public void prime(int num)
	{
		int factor=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				factor++;
		}
		if(factor==2)
			armstrong(num);
		else
			System.out.println("not prime");
	}
	public void armstrong(int x)
	{
		int digits=0,sum=0;
		for(int i=x;i>0;i/=10)
			digits++;
		for(int j=x;j>0;j/=10)
		{
			int rem=x%10;
			sum=sum+power(rem,digits);
		}
		if(sum==x)
			System.out.println("Prime & Armstrong");
		else
			System.out.println("Prime but not Armstrong");
			
	}
	public int power(int a,int b)
	{
		int mul=1;
		for(int i=1;i<=b;i++)
		{
			mul=mul*a;
		}
		return mul;
	}
}
