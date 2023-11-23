package Practice;
import java.util.*;
public class Sum_prime {

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		int num=s.nextInt();
		Sumofprime sp=new Sumofprime();
		sp.digitFactors(num);
	}
}
class Sumofprime
{
	public void digitFactors(int num)
	{
		int rem=0,fact_sum=0;
		for(int i=num;i>0;i/=10)
		{
			rem=i%10;
			fact_sum=fact_sum+factors(rem);
		}
		System.out.println(fact_sum);
	}
	public int factors(int num)
	{
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				sum=sum+prime(i);
		}
		return sum;
	}
	public int prime(int n)
	{
		int factors=0;
		for(int i=2;i<=n;i++)
		{
			if(n%i==0)
				factors++;
		}
		if(factors==1)
			return n;
		else
			return 0;
	}
	
}
