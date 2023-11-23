package Practice;

public class Ex3_20_4_23 {

	public static void main(String[] args) {
		Pattern p=new Pattern();
		p.eqTri();
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
}
