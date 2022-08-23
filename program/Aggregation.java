import java.util.Scanner;

class Employee
{	
	
	int Employee_id;
	String Employee_Name;
	String Address;
	int Year_Birth;
	int Salary;
	
	Employee(int Employee_id,String Employee_Name,String Address,int Year_Birth,int Salary) 
	{
		this.Employee_id = Employee_id;
		this.Employee_Name = Employee_Name;
		this.Address = Address;
		this.Year_Birth = Year_Birth;
		this.Salary = Salary;
	}		
}

class E_Status
{
	
	int ES_id;
	String C_Status;
	String H_status;
	float Percentage;	
	Employee emp;            //used as a non-primitive obj type (so declared like a variable)
	
	E_Status(int ES_id,String C_Status,String H_Status,float Percentage,Employee emp)   // declared here
	{
		this.ES_id = ES_id;
		this.C_Status = C_Status;
		this.H_status = H_Status;
		this.Percentage = Percentage;		
		this.emp = emp;        
	
    }
	
}

class Aggregation
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee details : ");
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
		Employee employ1= new Employee(Employee_id,Employee_Name,Address,Year_Birth,Salary);
		E_Status Employee_Status = new E_Status(201,"Active","Good", 90.6f, employ1);         //Aggregation is done here(by calling the object (employ1) from Employee class)
		
		System.out.println("E_Statusid: "+Employee_Status.ES_id);
		System.out.println("E_Statusid: "+Employee_Status.C_Status);
		System.out.println("E_Statusid: "+Employee_Status.H_status);
		System.out.println("E_Statusid: "+Employee_Status.Percentage);
		System.out.println("E_Statusid: "+Employee_Status.emp.Employee_id);         //all values are stored in emp, by calling "emp", we will get the output
		System.out.println("E_Statusid: "+Employee_Status.emp.Employee_Name);
		System.out.println("E_Statusid: "+Employee_Status.emp.Address);
		System.out.println("E_Statusid: "+Employee_Status.emp.Salary);
		System.out.println("E_Statusid: "+Employee_Status.emp.Year_Birth);
	
	}

}