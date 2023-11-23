package Practice;
import java.util.Scanner;
public class Check_num_sumOfPrimes
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Num value:-");
		int num=sc.nextInt();
		int count=0;
		for(int x=1;x<num;x++)
		{
			int factors=0;
			for(int i=1;i<=x;i++)
			{
				if(x%i==0)
					factors++;
			}
			if(factors==2)
				count++;
		}
		System.out.println(count);
		int a[]=new int[count],y=0;
		for(int z=1;z<num;z++)
		{
			int factors=0;
			for(int i=1;i<=z;i++)
			{
				if(z%i==0)
					factors++;
			}
			if(factors==2 && y<count)
			{
				a[y]=z;
				y++;
			}
					
		}
		for(int temp:a)
			System.out.print(temp+" ");
		System.out.println();
		for(int j=0;j<a.length;j++)
		{
			for(int k=j+1;k<a.length;k++)
			{
				if(a[j]+a[k]==num)
					System.out.println(num+" is sum of "+a[j]+" & "+a[k]);
			}
		}
	}
		
}

