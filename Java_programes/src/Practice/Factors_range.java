package Practice;

public class Factors_range {

	public static void main(String[] args) {
		int start=1,end=1000;
		for(int i=start;i<=end;i++)
		{
			System.out.print("Factors of "+i+" are:-");
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					System.out.print(j+" ");
					
			}
			System.out.println();
		}

	}

}
