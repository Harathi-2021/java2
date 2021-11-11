package basics;
class stud
{
	int rollno;
	String Name;
	double fee;
	void percentage()//method
	{
		int sub1=98,sub2=90,sub3=89;
		double per=(sub1+sub2+sub3)/3;
		System.out.println("percentage:"+per);
	}
	stud()//default constructor
	{
		System.out.println("It,s a default constructor");
	}
	stud(int rollno,String Name,double fee)//parameterized constructor
	{
		this();//call default constructor call
		this.percentage();//method call
		this.rollno=rollno;
		this.Name=Name;
		this.fee=fee;
	}
	void display()
	{
		System.out.println(rollno+" "+Name+" "+fee);
	}
}

public class thisstudent {

	public static void main(String[] args) {
		stud S=new stud(1,"Meena",12345.98);
		S.display();

	}

}
