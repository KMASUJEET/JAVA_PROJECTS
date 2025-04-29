package BANKS_PROJECT;


public class Employee {
	private String Name;
	private  long Mobile;

	Employee(String name,long mobile){
		Name=name;
		Mobile =mobile;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public long getMobile() {
		return Mobile;
	}
	public void setMobile(long mobile) {
		Mobile = mobile;
	}
	
	void displayEmployeeDetails() {
		  System.out.println("---------EmployeeDetails------");
		  System.out.println("NAME     :"+getName());
		  System.out.println("MOBILE   :"+getMobile());
	      System.out.println();
	  }
}


