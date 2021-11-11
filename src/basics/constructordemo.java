package basics;

public class constructordemo 
{
	constructordemo()
	{
		System.out.println("it is a default constructor");
	}
	constructordemo(String str)
	{
		System.out.println("it's a parameterized constructor"+str);
	}
	

	public static void main(String[] args) {
		constructordemo cd=new constructordemo();
		constructordemo cd1=new constructordemo("Hello");
		

	}

}
