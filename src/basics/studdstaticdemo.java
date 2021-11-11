package basics;

public class studdstaticdemo 
{
	int Rollno;
	String Name;
	static String Institute="Edubridge";
	studdstaticdemo(int r,String n)
	{
		Rollno=r;
		Name=n;
	}
	void put()
	{
		System.out.println("Rollno : "+Rollno);
		System.out.println("Name : "+Name);
		System.out.println("Institute: "+Institute);
	}

	public static void main(String[] args) {
		studdstaticdemo sd=new studdstaticdemo(1,"siya");
		studdstaticdemo sd1=new studdstaticdemo(2,"Riya");
        sd.put();
        sd1.put();
	}

}
