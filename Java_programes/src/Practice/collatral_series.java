package Practice;
import java.util.Scanner;
public class collatral_series
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num value:-");
		int num=sc.nextInt();
		System.out.print(num+" ");
		collatral_series obj=new collatral_series();
		obj.even_odd(num);
	}
	public void even_odd(int n)
	{
		int num=0;
		while(n>1)
		{
			if(n%2==0)
			{
				num=n/2;
				System.out.print(num+" ");
			}
			else
			{
				num=(3*n+1)/2;
				System.out.print(num+" ");
			}
		n=num;
		}
	}

}
