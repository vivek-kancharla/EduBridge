package employeedetails;

class employee {
	
	int empId;
	String empName;
	int empSalary;
	String empDesg;
	public void display()
	{
		empId=346;
		empName="vivek kancharla";
		empSalary=40000;
		empDesg="technician";
		System.out.println("Employee Id :"+empId+"\nEmployee Name :"+empName+"\nEmployee Salary :"+empSalary+"\nEmployee desg :"+empDesg);
	}
	public static void main(String[] args) {
		
		employee emp = new employee();
		emp.display();
		//employee emp1=new employee();
		//emp1.display();
		//employee emp2=new employee();
	    //emp2.display();
	}

}
