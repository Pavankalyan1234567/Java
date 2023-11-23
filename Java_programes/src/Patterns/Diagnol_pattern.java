package Patterns;

public class Diagnol_pattern {

	public static void main(String[] args) {
		int i,j,r=5,c=5;
		for(i=1;i<=r;i++)
		{
			for(j=1;j<=c;j++)
			{
				if(i==j || j==(c+1)-i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}


	}

}
