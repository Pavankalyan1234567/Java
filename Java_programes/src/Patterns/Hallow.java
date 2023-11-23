package Patterns;
import java.util.Scanner;
public class Hallow {

	public static void main(String[] args) {
		int r,c;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number of rows:-");
		r=obj.nextInt();
		System.out.println("Enter the number of columns:-");
		c=obj.nextInt();
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				if(i==1 || i==r || j==1 || j==c || i==j || (i+j)==r+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
