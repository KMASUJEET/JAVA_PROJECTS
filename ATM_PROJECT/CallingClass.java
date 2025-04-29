package ATM_PROJECT;
import java.util.Scanner;
 public class CallingClass extends ATMProject  {
	static String EnterNumber;
    public static void main(String[] args) { 	 
    Scanner scanner     =  new Scanner(System.in);
    CallingClass Class  = new CallingClass(); 
    System.out.print("Enter Registered Mobile Number:>"); 
    String enterNumber=scanner.next().trim();
    EnterNumber=enterNumber; 
 switch(enterNumber) {
 case "9911261533":System.out.println("Hello..SUJEET KUMAR :");Class.mobile();
 case "9801482458":System.out.println("Hello..AMIT KUMAR :"  );Class.mobile();
 case "11":System.out.println("Hello..SUJIT KUMAR :" );Class.mobile();
 case "9473711398":System.out.println("Hello..SHIVAM KUMAR :");Class.mobile();
 default          :Class.clear1();CallingClass.main(null);
      }  	
    }
}

