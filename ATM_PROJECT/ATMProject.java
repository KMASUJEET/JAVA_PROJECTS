package ATM_PROJECT;
import java.util.*;
//class(...

class ATMProject{
	
	static {
	System.out.println("__________________________________________________");
	System.out.println("                  Welcome 2ATM                    ");
	System.out.println("        CardLess Withdraw Using Mobile OTP        ");
	System.out.println("__________________________________________________\n");	
	}
	
	 Scanner scanner = new Scanner(System.in);
	 Random random = new Random();
	 private String EnterPin="1212";
     private float InitialBalance=2000;     
     float Depositamount=0; 
     float Withdrawamount=0; 
     
     //mobile method(...      
    protected void mobile() {  	try { 
   	 int otp= 1000+random.nextInt(1000);
   	 String OTP = Integer.toString(otp);
   	 String enteredMobileNo=CallingClass.EnterNumber;
   	 System.out.print("\nEntered Register Mobile Number :"+enteredMobileNo);    	  	   
   	 System.out.print("\nReEnter Register Mobile Number :>");
   	 String confirmMobileNo = scanner.next(); 
   	 System.out.println("__________________________");
         if(enteredMobileNo.equals(confirmMobileNo)) {
       	  System.out.print("Recived OTP:"+OTP+"\n"); 
       	  System.out.print("Enter Recived OTP:>");    
       	  String  enteredOtp = scanner.next(); 
       	 if ( enteredOtp.equals(OTP)) {
       	 System.out.println("___________________________________");
       	 System.out.println("Sucessfully Verify Mobile Number :"
       	 		          + "     \nEnter ATM PIN & Proceed..."); 
     	System.out.println("___________________________________");
     	checkpin();
        }else {
       	 System.out.println("Enter OTP Wrong");mobile();
        }
       	   }else {
       		   System.out.println("Enter Invalid Mobile Number..");
       		   CallingClass.main(null);
       	      }
    }catch(Exception e) {
    	System.out.println("SYSTEM NOT working:");CallingClass.main(null);
    	} 
           } 
    // Checkpin method(...
    
     private void checkpin() { 	 try {
	  System.out.print("Enter PIN :>"+" ");
	  String enterPin = scanner.next();
	  if(EnterPin.equals(enterPin)) {
	  menu();
	  }  
	  else {
	  System.out.println("! Enter Invalid PIN ! :\n");
	  reset();
	    }
     }catch(Exception e) {
     	System.out.println("check PIN not working:");
     	} 
	  }	  
	  //reset method(....
     
	  private void reset() { 
	  try {
	  System.out.print("(1)Try Again :(2)Reset PIN (3)Update PIN:(4)Exit\n>");
		String option = scanner.next();
		switch(option) {
		case "4" :exit();
	    case "3" :updatePin();
		case "1" :checkpin();
		case "2" :System.out.println("Reset Your PIN : ");
			    System.out.print("(1)Debit Card:(2)Aadhar OTP:(3)Exit\n>");
			    String pinSelect = scanner.next();
			    switch(pinSelect) {
				  case "1" :atmcard();
				  case "2" :adharotp();
				  case "3" :exit();
				  default : System.out.println("Choose Correct Option :\n");
				  reset();   			  
			  }
		          default :System.out.println("Choose Correct Option :\n");
		          reset();
		}	
	  }catch(Exception e) {
      	System.out.println("system not working:");
      	} 
	  }
	// Menu method(...     
       
    private void menu() { try {
	System.out.println("Select Your Choice :");
	System.out.print("(1)Balance:(2)Withdraw:(3)Deposit:(4)MiniStatemnt:(5)Exit");
	System.out.println();
	System.out.print("_________________________________________________________\n>");
	  String enterchoice= scanner.next();
	  switch(enterchoice) {
	  case "1"  :checkbalance();
	  case "2"  :withdraw() ;
	  case "3"  :deposite();
	  case "4"  :MiniStatemnt();
	  case "5"  :exit(); 
      default : System.out.println("Invalid Choice:Select Correct Choice & Proceed");menu();
	  }
    }catch(Exception e) {
    	System.out.println("Menu not working:");
    	} 
	} 
  //CHECKbalance method (.... 
    
    private void checkbalance() {	 
	System.out.println("Avilable Balance :"+InitialBalance);
	menu(); 
}
  //withdraw method (....
   
    private void withdraw() {   
    	System.out.print("Enter Amount Withdraw:>");
  try {	float withdawamount = scanner.nextFloat();
    	Withdrawamount=withdawamount;
    	if(withdawamount>20000){
    			System.out.println("\nCan't Withdraw More Than 20 Thousend At Same Time:");
    			System.out.println("______________________________________");
    			menu();
    	} 
    	else if(withdawamount<=InitialBalance) {
    		InitialBalance=InitialBalance-withdawamount;
    		System.out.print("Remaning balance :"+InitialBalance+"\n");
    	} 
    	else {
    		System.out.println("Insufficient Balance");	
    	}
       }
  catch(Exception e){
  	System.out.println(" !  Invalid Input  !"); 	
  }finally {
	   
       menu();
       }
    	
    } 
      // DEPOSITE method(....
    
    private void deposite() {	   
    	System.out.print(" Amount Want Deposite :>");
    try { float depositamount = scanner.nextFloat();
    	Depositamount=depositamount;
    	if ( depositamount<=49000) {
    	InitialBalance =InitialBalance+depositamount;
    	System.out.print("\nTotal Balance :"+InitialBalance+"\n");
    	 } 
    	else {
        System.out.println("\nCan't Deposite More Than 49 Thousend At Same Time:");
    	System.out.println("__________________________________________________"); 
    	}
    	
       }
    catch(Exception e){
    	System.out.println(" !  Invalid Input  !"); 	
    	
    }finally {
    	  
    	   menu();
    	   }
    	     
    }  
  //MiniStatemnt method(....
    
    private void MiniStatemnt() {
 	try {   for (int i = 0; i < 15; i++) {
           System.out.println();
       } 
 		    System.out.println("_______________________________");
 		    System.out.println("Your last  Transactions:");
 	   	
 	       double balance1=InitialBalance;double max=49001;
 	       double min=20001;
 	       System.out.println("Opening Balance   : " +"INR  "+"2000");		    
 	     
 	      try { if((Depositamount) <(max) ) {
 	    	  System.out.println("Last Deposit      : " +"INR  "+Depositamount);
 	      }else {
 	    	  System.out.println("Last Deposit      : " +"INR  "+"0.0");  
 	      }
 	    	  if((Withdrawamount) <=(balance1)&&(Withdrawamount)<(min)) {  
 	    	   System.out.println("Last Withdraw     : " +"INR  "+Withdrawamount);
 	    	  }else {
 	    		 System.out.println("Last Withdraw     : " +"INR  "+"0.0");  
 	    	  }
 	    	  }catch(Exception e) {MiniStatemnt();} 
 		    System.out.println("Total Balance     : " +"INR  "+InitialBalance);
 		    System.out.println("________________________________");
 		    menu();checkpin();
 	  }catch (Exception e) {
      	System.out.println("Ministatement  not working:");
      	} 
}  
  //exit method(....
    
    private void exit() { 
   	 for (int i = 0; i < 20; i++) {
            System.out.println();
        }         
          System.out.println("!Thank You Using Me. Visit again!");
          System.out.println("_________________________________________");
          System.out.println();  
          CallingClass.main(null);      
 }  
    // Clear method (.....  
 
     private void clear() { 
        for (int i = 0; i < 25; i++) {
        System.out.println();
        	        }  	        
        	    } 
     
     //clear1 method(....
     protected void clear1() { 
    	 for (int i = 0; i < 20; i++) {
    	 System.out.println();   }
    	 System.out.println("_______________________________________________");
    	 System.out.println("! Hello.. Dear Cardholders Welcome to ATM !");
    	 System.out.println("_______________________________________________");
    	 System.out.println("Your Mobile Number:"+CallingClass.EnterNumber);
    	 System.out.println("Your Mobile Number Is 'Not' Register With Us."
    	                  + "\nPlease Contact With Your Home Branch For More Detail...\n\n\n");   	    	 
    	 }
    //updatePin method(....

    private void updatePin() {
        clear();try {
        System.out.println("Update Your ATM PIN Via Old PIN:");
        System.out.print("Enter Old PIN:>");
        String currentPin = scanner.next();
        if (currentPin.equals(EnterPin)) {
            System.out.print("Enter New PIN:> ");     
            String newPin = scanner.next();
            System.out.print("Confirm New PIN:> ");     
            String confirmPin = scanner.next();
            if (newPin .equals(confirmPin) ) {
            	EnterPin= newPin;
                System.out.println("! PIN Updated Successfully !");
                checkpin();
            } 
            else {
                System.out.println("PIN Not Match Try Again.\n");
                reset();
            }
        } 
            else {
            System.out.println("You Enter Incorrect Old PIN! \n");
            reset();
        } 
        }catch (Exception e) {
        	System.out.println("Update PIN not working:");
        	}    
    }   
    //ATMcard method (....       
    String  Entercarddetail="";
    private void atmcard() {
    clear();  try { 
    int card1 = 1000+random.nextInt(1000);
    int card2 = 1000+random.nextInt(1000);
    int card3 = 100+random.nextInt(100);
    int card4 = 1000+random.nextInt(1000);
    String Card =Integer.toString(card4);
    String Cards="07"+Card;
    System.out.println("_____________________________________________________");
    System.out.print("Debit card NO :"+card1+"-"+"XXXX"+"-"+"XXXX"+"-"+ Card);
    System.out.println(); 
    System.out.println("_____________________________________________________");
	System.out.println("For Full Card Detail With CVV & Expiry "
			         + "\nPress('one' 1 )Otherwise Press Any Key For Continue.. ");
	System.out.println("_____________________________________________________");
	System.out.print(">");
	String enterOption= scanner.next();
	if("1".equals(enterOption)) {
		    System.out.println("___________________________________________________");
		    System.out.print("Debit card NO :  "+card1+" - "+card2+" - "+3607+" - "+ Card);
		    System.out.println();
		    System.out.println("\nCVV  : "+card3  + "             " +" Expiry : 08/2030");	    
		    System.out.println("Note:card number may be changed every trnx for security:");
		    System.out.println("___________________________________________________");			   
	}else {
		System.out.print("Enter LAST 6 Digit ATMCard No.:>");	    
		String entercarddetail= scanner.next();
		Entercarddetail=entercarddetail;
	}	
	if(Cards.equals(Entercarddetail)) {
	System.out.print("Enter New PIN:> ");
    String newPin1 = scanner.next();
    System.out.print("Confirm New PIN:> ");    
    String confirmPin = scanner.next();
    if (newPin1.equals(confirmPin) ) {
    	EnterPin = confirmPin;
        System.out.println("PIN Updated Successfully!");
        checkpin();
    } 
    else {
        System.out.println("PIN Not Match Try Again.\n");
      reset();
      } 
   }
	else {
		  reset();
	    }
    }catch(Exception e) {
    	System.out.println("VDC Card not working:");
    	} 
	
    }
  //AAdharotp method(....		
   
     private void adharotp() { 
        clear();try {
	    int otp = 100000+random.nextInt(100000);
	    String OTP1=Integer.toString(otp);
	    System.out.println("_______________________________________________");
	    System.out.println("Aadhar OTP    :"+(OTP1));   
	    System.out.println("_______________________________________________");
	    System.out.print("Enter Adahar OTP:> ");

	    String enterOtp= scanner.next();
	    if(OTP1.equals(enterOtp)) {
	    System.out.print("Enter New PIN:> ");
        String newPin3 = scanner.next();
        System.out.print("Confirm New PIN:> "); 
        String confirmPin3 = scanner.next();
        if (newPin3.equals(confirmPin3)) {
        EnterPin = confirmPin3;
        System.out.println("PIN Updated Successfully!");
        checkpin();
        } 
        else {
        System.out.println("PIN Not Match Try Again.\n");
        reset();
              }
        }
	    else {
		System.out.println("Incorrect OTP : \n");
		reset();
	    }	    
        }catch(Exception e) {
        	System.out.println("Aadhar OTP not working:");
        	}    
     }
  }  
  


