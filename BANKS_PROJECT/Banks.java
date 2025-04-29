package BANKS_PROJECT;


public class Banks {
	private String accountNumber;
	private String ifscCode;
	Banks(String accountNumber,String ifscCode){
		this. accountNumber = accountNumber;
		this. ifscCode= ifscCode;		
	}
public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		accountNumber = accountNumber;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	void displayBankDetails() {
		  System.out.println("---------BankDetails----------");
		  System.out.println("ACCOUNT  :"+getAccountNumber());
		  System.out.println("IFSC CODE:"+getIfscCode());
	     System.out.println();
	  }
 }




