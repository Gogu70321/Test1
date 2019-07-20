package project1;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks: ");
	int mark = sc.nextInt();
	

	String Grade= "";
	
	mark = mark/10;
	
	switch(mark) {
	
	case 8:
		Grade = "O";
		break;
	case 7:
		Grade = "E";
		break;
	case 6:
		Grade = "A";
		break;
	case 5:
		Grade = "B";
		break;
	case 4:
		Grade = "C";
		break;
	default:
		Grade = "F";
	}

	System.out.println("Grade is : " +Grade);
}
}
