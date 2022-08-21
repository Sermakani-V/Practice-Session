import java.util.Scanner;

class Emoployee
{	
	
	int Employee_id;
	String Employee_Name;
	String Address;
	int Year_Birth;
	int Salary;
	
	Emoployee(int Employee_id,String Employee_Name,String Address,int Year_Birth,int Salary) 
	{
		this.Employee_id = Employee_id;
		this.Employee_Name = Employee_Name;
		this.Address = Address;                            //using this.
		this.Year_Birth = Year_Birth;
		this.Salary = Salary;
	}		
}

class Manager1 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee details");
		System.out.println("Enter the employee id : ");
		int Employee_id = sc.nextInt();
		System.out.println("Enter the employee Name : ");
		String Employee_Name=sc.next();
		System.out.println("Enter the employee Address : ");
		String Address =sc.next();
		System.out.println("Enter the employee birth year : ");
		int Year_Birth=sc.nextInt();
		System.out.println("Enter the employee Salary : ");
		int Salary=sc.nextInt();		
		
		Emoployee employee= new Emoployee(Employee_id,Employee_Name,Address,Year_Birth,Salary);
		
		System.out.println("Emp id : "+employee.Employee_id);
		System.out.println("Emp name : "+employee.Employee_Name);
		System.out.println("Emp address : "+employee.Address);
		System.out.println("Emp year of Birth : "+employee.Year_Birth);
		System.out.println("Emp salary : "+employee.Salary);

	}

}