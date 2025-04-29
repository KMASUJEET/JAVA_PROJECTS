package BANKS_PROJECT;


public class Address {
	private int     HouseNo;
	private	String  Village;
	private	String  District;
	private	String  State;
	private	int     PIN;

Address(int HouseNo,String  Village,String  District,
String  State,int PIN){
	this.HouseNo=HouseNo;
	this.Village=Village;
	this.District=District;
	this.State=State;
	this.PIN=PIN;	
}

public int getHouseNo() {
	return HouseNo;
}

public void setHouseNo(int houseNo) {
	HouseNo = houseNo;
}

public String getVillage() {
	return Village;
}

public void setVillage(String village) {
	Village = village;
}

public String getDistrict() {
	return District;
}

public void setDistrict(String district) {
	District = district;
}

public String getState() {
	return State;
}

public void setState(String state) {
	State = state;
}

public int getPIN() {
	return PIN;
}

public void setPIN(int pIN) {
	PIN = pIN;
    }
void displayAddress() {
	  System.out.println("---------Address--------------");
	  System.out.println("HOUSE NO :" + getHouseNo());
      System.out.println("VILLAGE  :" + getVillage());
      System.out.println("DISTRICT :" + getDistrict());
      System.out.println("STATE    :" + getState());
      System.out.println("PIN      :" + getPIN());
      System.out.println();
  }
}


