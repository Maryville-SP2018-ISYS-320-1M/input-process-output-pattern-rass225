/*
	ISYS 320
	Name(s):
	Date: 
*/
import java.util.Scanner;
public class P2_Doubler {

	public static void main(String[] args) {
		System.out.println("What is your number?");
		Scanner console = new Scanner(System.in); 
		int input = console.nextInt(); 
		System.out.println("The number doubled is " + (input * 2));
	}

}
