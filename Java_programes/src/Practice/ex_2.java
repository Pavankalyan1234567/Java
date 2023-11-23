package Practice;
import java.util.Scanner;

public class ex_2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input value:-");
		String input=sc.next();
		String Type;
		if(input.equals("Ug"))
		{
			Ug obj=new Ug();
			Type=obj.type();
			if(Type.equals("Btech"))
				obj.Btech();
			else
				obj.Bsc();
		}
		else
		{
			Pg obj1=new Pg();
			Type=obj1.type();
			if(Type.equals("Mtech"))
				obj1.Mtech();
			else
				obj1.Ms();
		}
		

	}

}
class Ug
{
	String type()
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter type of course:-");
		String type=sc1.next();
		return type;
	}
	void Btech()
	{
		System.out.println("Courses in Btech:-");
		System.out.println("1.CSE");
		System.out.println("2.ECE");
		System.out.println("3.EEE");
		System.out.println("4.MECH..........................");
	}
	void Bsc()
	{
		System.out.println("Courses in Bsc:-");
		System.out.println("1.BSC_COMPUTERS");
		System.out.println("2.BSC_SCIENCE");
		System.out.println("3.BSC_CHEMISTRY");
		System.out.println("4.BSC_PHYSICS..............................");
	}
}
class Pg
{
	String type()
	{
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter type of course:-");
		String type=sc2.next();
		return type;
	}
	void Mtech()
	{
		System.out.println("Mtech Courses:-");
		System.out.println("1.COMPUTER SCIENCE");
		System.out.println("2.ECE");
		System.out.println("3.MECH");
		System.out.println("4.EEE");
	}
	void Ms()
	{
		System.out.println("Ms Courses:-");
		System.out.println("1.COMPUTER SCIENCE");
		System.out.println("2.ARTIFICAIL INTILIGENCE");
		System.out.println("3.DATA ANALYST");
		System.out.println("4.BIG DATA");
		System.out.println("5.INTERNET OF THINGS");
	}
}