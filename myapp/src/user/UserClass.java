package user;
import beans.Employee;
public class UserClass {

	public static void main(String[] args) {
	
		Employee emp1= new Employee();
		emp1.eid=1001;
		emp1.ename="anuj";
		emp1.salary=9990.89;
		Employee emp2= new Employee();
		emp2.eid=1002;
		emp2.ename="kanisk";
		emp2.salary=8009.89;
System.out.println(emp1.eid+"  "+emp1.ename+"  "+emp1.salary);
System.out.println(emp2.eid+"  "+emp2.ename+"  "+emp2.salary);
	}

}
