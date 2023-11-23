package Patterns;

public class Time_glass {

	public static void main(String[] args) {
		int i,j,s,r=5,c=5;
		for(i=1;i<=r;i++)
        {
			for(s=1;s<i;s++)	
        		System.out.print(" ");
            for(j=c;j>=i;j--)
                System.out.print("*"+" ");   
        System.out.println();
        }
        for(i=2;i<=r;i++)
        {
        	for(s=c-1;s>=i;s--) 
        		System.out.print(" ");
            for(j=1;j<=i;j++) 
                System.out.print("*"+" ");
         System.out.println();
        }
	
	}

}
