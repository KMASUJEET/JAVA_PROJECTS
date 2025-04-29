package BANKS_PROJECT;


import java.util.Scanner;
public class SetData {
	 void setData(String s,int x) {
			
		 Address address1=new Address(12,"Alapur","Begusarai","Bihar",851112);
		 Address address2=new Address(11,"laxmipur","Grugram","Haryana",671112);
		 Address address3=new Address(15,"Sitapur","North Delhi","Delhi",110033);
		 Address address4=new Address(19,"Sector-100","Noida","Utter Pardesh",851002);	
		 
		 Banks banks1 = new  Banks("31516062166", "SBIN0002912");
		 Banks banks2 = new  Banks("31516062177", "SBIN0002912");
		 Banks banks3 = new  Banks("31516062188", "SBIN0002912");
		 Banks banks4 = new  Banks("31516062199", "SBIN0002912");	
		 
		 Employee emp1 =new Employee ("sujeet Kumar",9911261533l);
		 Employee emp2 =new Employee ("Pranjula",8875123401l);
		 Employee emp3 =new Employee ("Hari Om",8802109309l);
		 Employee emp4 =new Employee ("Lata Shakya",7065378838l);
		 
  System.out.print("Enter your mobile number:");
  Scanner scanner = new Scanner(System.in);
  String mobile= scanner.next().trim();	
  
  switch(mobile) {

  case "9911261533": System.out.println("*************************");
	                 System.out.println("YOUR Details......."); 
	                 emp1.displayEmployeeDetails();banks1.displayBankDetails();
	                 address1.displayAddress();                  
	                 System.out.println("*************************");
                     break;
  case "8875123401": System.out.println("*************************");
                     System.out.println("YOUR Details......."); 
                     emp2.displayEmployeeDetails();banks2.displayBankDetails();
                     address2.displayAddress();	   
                     System.out.println("*************************");
                     break;
  case "8802109309": System.out.println("*************************");
                     System.out.println("YOUR Details......."); 
                     emp3.displayEmployeeDetails();banks3.displayBankDetails();
                     address3.displayAddress();
                     System.out.println("*************************");
                     break;
  case "7065378838": System.out.println("*************************");
                     System.out.println("YOUR Details......."); 
                     emp4.displayEmployeeDetails();banks4.displayBankDetails();
                     address4.displayAddress();	   
                     System.out.println("*************************");
                     break;
  default:           System.out.println("****************************");
                     System.out.println("Sorry Invalid Mobile Number");
                     System.out.println("****************************");
      }
  }
}




