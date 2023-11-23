package class_obj;

public class classobj_ex2 
{
	public int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public static void main(String[] args) 
	{
		classobj_ex2 obj=new classobj_ex2();
		int result=obj.add(2,3);
		System.out.println(result);

	}

}
