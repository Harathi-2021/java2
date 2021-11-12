package basics;
class Animal//parent
{
	void eat()
	{
		System.out.println("Eating");
	}
	
}
class Tiger extends Animal //child{
{
	void run()
	{
		System.out.println("Running..");
	}
	
}
class cat extends Animal //child
{
	void sleep()
	{
		System.out.println("Sleeping...");
		
	}
}

public class HiearachicalinheritanceTest {

	public static void main(String[] args)
	{
		Tiger t=new Tiger();
		t.run();
		cat c=new cat();
		c.sleep();
		Animal a=new Animal();
		a.eat();
		
	

	}

}
