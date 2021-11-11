package basics;

public class Employee 
{
	int EmId;
	String EmpName;
	double Salary;
	Employee(int Id,String Name)
	{
		EmId=Id;
		EmpName=Name;
	}
	Employee(int Id,String Name,double sal)
	{
		EmId=Id;
		EmpName=Name;
		Salary=sal;
	}
	void Disp()
	{
		System.out.println("EmId:"+EmId);
		System.out.println("EmName:"+EmpName);
	}
	void print()
	{
		System.out.println("EmId:"+EmId);
		System.out.println("EmName:"+EmpName);
		System.out.println("Salary:"+Salary);
	}
	
	

	public static void main(String[] args) {
		Employee e=new Employee(101,"Teena");
		Employee e1=new Employee(102,"Reena",90000.98);
	    e.Disp();
		e1.print();

	}

}
