package basics;
class Grandparent
{
	void watch()
	{
		System.out.println("Watching...");
	}
}
class parent extends Grandparent
{
	void read()
	{
		System.out.println("Reading...");
	}
}
class child extends parent
{
	void  play()
	{
		System.out.println("playing");
	}
}

public class singleinheritancedemo {

	public static void main(String[] args)
	{
		parent p=new parent();
		p.watch();
		p.read();
		child ch=new child();
		ch.read();
		ch.play();
		ch.watch();
		
		
		

	}

}
