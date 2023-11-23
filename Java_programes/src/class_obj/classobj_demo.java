package class_obj;

public class classobj_demo 
{
	public static void main(String []args)
	{
		Student std=new Student();
		std.Name="Pavan";
		std.Roll_no=101;
		std.Course="CSE";
		std.Sec='A';
		std.Mobile=1234567890;
		System.out.println(std.Roll_no);
		System.out.println(std.Name);
		System.out.println(std.Course);
		System.out.println(std.Sec);
		System.out.println(std.Mobile);
	}

}
class Student
{
	String Name,Course;
	int Roll_no,Mobile;
	char Sec;
		
}