package BANKS_PROJECT;


import java.util.Random;
import java.util.Scanner;
public class Test {
		public static void main(String[] args) {
			SetData setDataobject= new SetData();
			Random random= new Random();
			Scanner scanner= new Scanner(System.in);
			int randomNumber=100000+random.nextInt(100000);
			String RandomNr=""+ randomNumber;
			System.out.println("Captcha Code  :"+RandomNr);
			System.out.println("***********************************");
			System.out.print("Enter Captcha :");
			String enterCaptcha= scanner.next();
			System.out.println("***********************************");
			
			if(RandomNr.equals(enterCaptcha)) {
			setDataobject.setData("Start",1);
			}
			else {
				System.out.println("You Enter Invalid Captcha ");
			}
		   }
		}


