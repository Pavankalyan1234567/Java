package Practice;
import java.util.Scanner;
public class Exp_20_4
{

	public static void main(String[] args) 
	{
		Cp obj=new Cp();
		int n,r,s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n & r");
		n=sc.nextInt();
		r=sc.nextInt();
		s=n-r;
		obj.combination(n,r,s);
		obj.permutation(n,s);

	}

}
class Cp
{
	public void combination(int n,int r,int s)
	{
		int fact_n=0,fact_r=0,fact_s=0;
		double ncr=0.0;
		fact_n=fact(n);
		fact_r=fact(r);
		fact_s=fact(s);
		ncr=fact_n/(fact_r*fact_s);
		System.out.println(ncr);
		
	}
	public void permutation(int n,int s)
	{
		int fact_n=0,fact_s=0;
		double npr=0.0;
		fact_n=fact(n);
		fact_s=fact(s);
		npr=fact_n/fact_s;
		System.out.println(npr);
	}
	public int fact(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}