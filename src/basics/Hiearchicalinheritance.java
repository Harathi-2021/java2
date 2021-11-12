package basics;

import java.util.Scanner;

class College
{
	int CollegeId;
	String CollegeName;
	Scanner Sc=new Scanner(System.in);
	void CollegeGet()
	{
		System.out.println("Enter the CollegeId");
		CollegeId=Sc.nextInt();
		System.out.println("Enter the CollegeName");
		CollegeName=Sc.next();
	}
}
class Learners extends College
{
	int stdId;
	String StudtName,Course;
	void Studentprint()
	{
		System.out.println("Enter the stdId");
		stdId=Sc.nextInt();
		System.out.println("Enter the StudtName");
		StudtName=Sc.next();
		System.out.println("Enter the Course");
		Course=Sc.next();
	}
}
class Trainer extends College
{
	int TeacherId;
	String TeacherName,designation;
	void TrainerDisp()
	{
		System.out.println("Enter the TeacherId");
		TeacherId=Sc.nextInt();
		System.out.println("Enter TeacherName");
		TeacherName=Sc.next();
		System.out.println("Enter the designation");
		designation=Sc.next();
	}
}
class Alumini extends College
{
	String Tc,Lc;
	void display()
	{
		System.out.println("Enter the Tc");
		Tc=Sc.next();
		System.out.println("Enter the Lc");
		Lc=Sc.next();
	}
}

public class Hiearchicalinheritance {

	public static void main(String[] args) {
		Learners le=new Learners();
		Trainer Te=new Trainer();
		Alumini Al=new Alumini();
		le.CollegeGet();
		le.Studentprint();
		Te.TrainerDisp();
		Te.CollegeGet();
		Al.CollegeGet();
		Al.display();
		

	}

}
