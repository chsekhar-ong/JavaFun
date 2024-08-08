package Examples;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {

		ConditionalStatements cs=new ConditionalStatements();
		//cs.checkif(-1);
		//cs.evencheck((int)1.5);
		//cs.scannerCheck();
		//cs.results();
	}

	public void checkif(int num) {

		if (num>0) {
			System.out.println("This is positive number");
		}
		else {
			System.out.println("This is negative number");
		}

	}
	//odd || even

	public void evencheck(int num) {

		if(num!=0) {
			if (num%2==0) {
				System.out.println("the given number is even");
			}
			else {
				System.out.println("the given number is odd");
			}
		}
		else {
			System.out.println("enter the valid number");

		}
	}
	//using scanner 
	public void scannerCheck() {

		Scanner sc=new Scanner(System.in);
		System.out.println("Your scanner is ready to proceed");

		System.out.println("Enter the test Number");
		int num=sc.nextInt();
		System.out.printf("your test number is %d%n", num);
		if(num!=0) {
			if(num%2==0) {
				System.out.println("the number is even number");
			}
			else {
				System.out.println("the number is odd number");
			}
		}
		else {
			System.out.println("enter the valid number");
		}

		sc.close();
	}

	//Finding the students examination results

	public void results() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the result");
		int result=sc.nextInt();

		if (result>=35) {
			if(result>=35 && result<=70) {
				System.out.printf("Student secured third class with result of %d marks%n",result);
			}
			else if(result>70 && result<85) {
				System.out.printf("Student secured second class with result of %d marks%n",result);
			}
			else if(result>85 && result<=100){
				System.out.printf("Student secured first class with result of %d marks%n",result);
			}
			else {
				System.out.printf("Enter the vaild result,%d is outrageous %n",result);
			}

		}

		else {
			System.out.println("Student is failed");
		}
		sc.close();
	}

	//predict the days of the week
	public void yourday() {
      Scanner sc = new Scanner(System.in);
      String day=sc.nextLine();
     // String[] weekdays= {"Monday","Tuesday","Wednesday","Thusday","Friday","Saturday","Sunday"};
     if(day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Tuesday") ||day.equalsIgnoreCase("Wednesday")  || day.equalsIgnoreCase("thusday") || day.equalsIgnoreCase("friday")) {
    	System.out.println("uff's its a weekday"); 
     }
     else if(day.equalsIgnoreCase("saturday")||day.equalsIgnoreCase("sunday")){
    	System.out.println("Hurry its weekend"); 
     }
     else {
    	 System.out.println("ENter the valid day");
     }
      sc.close();

	}
	
	
	//switch case
}
