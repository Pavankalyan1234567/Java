package Patterns;

public class Name {

	public static void main(String[] args) {
		int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
            	if(i==1||j==1||i==3 || (j==5 &&i<=3))
            		System.out.print("* ");
            	else
            		System.out.print("  ");
            }
            System.out.println();
        }
        

	}

}
