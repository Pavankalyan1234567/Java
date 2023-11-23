package Practice;
import java.util.Scanner;
public class Ex2_20_4_23 {

	public static void main(String[] args) {
		int num;
		prime p=new prime();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of num");
		num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
				System.out.println(i+" is even");
			else if(i==2)
				System.out.println(i+" is even and prime");
			else
			{
				int fact=p.prime_num(i);
				if(fact==2)
					System.out.println(i+" is odd & prime");
				else
					System.out.println(i+" is odd &  not prime");
			}
		}

	}
	

}
class prime
{
	public int prime_num(int num)
	{
		int factor=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				factor++;
		}
		return factor;
	}
}
