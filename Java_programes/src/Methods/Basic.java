package Methods;
import java.util.Scanner;
public class Basic 
{
	public static void main(String[] args) 
	{
	Demo d=new Demo();
	d.add();
	d.sub();
	}

}
class Demo
{
	void add()
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the Values of A & B:-");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println(c);
	}
	void sub()
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the Values of A & B:-");
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b)
			c=a-b;
			else
				c=b-a;
		System.out.println(c);
	}
}