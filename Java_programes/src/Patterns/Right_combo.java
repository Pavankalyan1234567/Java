package Patterns;

public class Right_combo {

	public static void main(String[] args) {
		int i,j,s;
        for(i=1;i<=6;i++)
        {
            for(s=6;s>i;s--)
                System.out.print("  ");
            for(j=1;j<=i;j++)
                System.out.print(j+" ");
            System.out.println();
        }
        for(i=5;i>=1;i--)
        {
            for(s=5;s>=i;s--)
                System.out.print("  ");
            for(j=1;j<=i;j++)
                System.out.print(j+" ");
            System.out.println();
        }

	}

}
