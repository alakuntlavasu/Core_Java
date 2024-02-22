package statickeyword;


class Emp{
	int eid;
	int esalary;
	 static String ceo;
	
	public void show() {
		System.out.println(eid +":"+esalary +":"+ceo);
	}
}
public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp naveen=new Emp();
		naveen.eid=101;
		naveen.esalary=2000;
		
		
		Emp jaggu=new Emp();
		jaggu.eid=102;
		jaggu.esalary=1500;
		jaggu.ceo="Rahul";

		naveen.show();
		jaggu.show();
	}

}
