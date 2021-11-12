package basics;
class Teacher //parent
{
	String designation="Trainer";
	String collegeName="Edubridge";
	void work()
	{
		System.out.println("Training");
	}
}

public class singleInheritanceTest extends Teacher
{
	String Subject="Fullstack";
	void learn()
	{
		System.out.println("Learners are learning");
	}

	public static void main(String[] args) 
	{
		singleInheritanceTest st=new singleInheritanceTest();
		System.out.println("collegeName:"+st.collegeName);
		System.out.println("designation:"+st.designation);
		System.out.println("Subject"+st.Subject);
		System.out.print("work");
		st.work();
		st.learn();
		

		

	}

}
