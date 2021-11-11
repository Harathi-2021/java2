package basics;

public class classstudent 
{
	int StudtId;
	String StudtName;
	double studtpercentage;
	classstudent(int Id,String Name)
	{
		StudtId=Id;
		StudtName=Name;
	}
	classstudent(int Id,String Name,double per)
	{
		StudtId=Id;
		StudtName=Name;
	    studtpercentage=per;
	}
	void disp()
	{
		System.out.println("StudtId:"+StudtId);
		System.out.println("StudtName:"+StudtName);
		System.out.println("studtpercentage:"+studtpercentage);
	}
	
	

	public static void main(String[] args) {
		classstudent s=new classstudent(10,"harathi",81.00);
		s.disp();

	}

}
