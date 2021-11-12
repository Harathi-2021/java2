package basics;

import java.util.Scanner;

class employ
{
	int salary,Totalsalary;
	Scanner Sc=new Scanner(System.in);
	void get()
	{
		System.out.println("Enter salary");
		salary=Sc.nextInt();
	}
	
}	
class programmer extends employ	
{
	int bonus;
	Scanner Sc=new Scanner(System.in);
	void display()
	{
		System.out.println("Enter bonus");
		bonus=Sc.nextInt();
		Totalsalary=salary+bonus;
		System.out.println("Totalsalary:"+Totalsalary);
	}
}

public class singleinheritance {

	public static void main(String[] args) {
		programmer pt=new programmer();
		pt.get();
		pt.display();

	}

}
