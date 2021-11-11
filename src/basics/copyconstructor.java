package basics;
class studentcopy{
 
		int Id;
		String Name;
		studentcopy(int i,String n)
		{
			Id=i;
			Name=n;
		}
		studentcopy(studentcopy s)
		{
			Id=s.Id;
			Name=s.Name;
		}
		void display() {System.out.println(Id+""+Name);}
	}
public class copyconstructor {

	public static void main(String[] args) {
		studentcopy st=new studentcopy(10,"Ram");
		studentcopy st1=new studentcopy(st);
		st.display();
		st1.display();

	}

}
