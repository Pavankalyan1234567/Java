package Patterns;

public class pyramid
{
	public static void main(String[] args)
	{
		int i,j,s,r=5,c=5;
		for(i=1;i<=r;i++)
        {
			for(s=r;s>=i;s--)	
        		System.out.print(" ");
            for(j=1;j<=i;j++)
                System.out.print(j+" ");   
        System.out.println();
        }
	}
}
