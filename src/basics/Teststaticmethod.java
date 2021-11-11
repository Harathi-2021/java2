package basics;
class student1
{
	int rollno;
	String name;
	static String college="Its";
	static void change()
	{
		college="BBDIT";
	}
	student1(int r,String n)
	{
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
}

public class Teststaticmethod 
{
	static
	{
		System.out.println("static block is invoked");
	}

	public static void main(String[] args) {
		{
			student1.change();
			student1 s1=new student1(10,"siya");
			s1.display();
		}

	}

}
