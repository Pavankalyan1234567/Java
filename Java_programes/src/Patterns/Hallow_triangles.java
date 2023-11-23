package Patterns;

public class Hallow_triangles {

	public static void main(String[] args) {
		int i,j,r=6,c=6,s;
		/*for(i=1;i<=r;i++)
        {
            for(j=1;j<=i;j++)
            {
            	if(j==1 || i==r || i==j)
            		System.out.print(j+" ");
            	else
            		System.out.print("  ");
            }
            System.out.println();
        }*/
		for(i=1;i<=r;i++)
        {
			for(s=c-1;s>=i;s--)
				System.out.print("  ");
            for(j=1;j<=i;j++)
            {
            	if(j==1 || i==r || i==j)
            		System.out.print(j+" ");
            	else
            		System.out.print("  ");
            }
            System.out.println(); 
        }
		

	}

}
