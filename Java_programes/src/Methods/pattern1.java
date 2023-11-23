package Methods;

public class pattern1 {

	public static void main(String[] args) {
		Pattern p=new Pattern();
		p.eqTri();
		p.reveq_tri();

	}

}
class Pattern
{
	public void eqTri()
	{
		int r=5,c=5;
		for(int i=1;i<=r;i+=2)
		{
			for(int s=r;s>i;s-=2)
				System.out.print("  ");
			for(int j=1;j<=i;j++)
				System.out.print("*"+" ");
		System.out.println();
		}
	}
	public void reveq_tri()
	{
		int r=3,c=3;
		for(int i=1;i<=r;i+=2)
		{
			for(int s=i;s>=1;s-=2)
				System.out.print("  ");
			for(int j=c;j>=i;j--)
				System.out.print("#"+" ");
		System.out.println();
		}
		
	}
	
}
