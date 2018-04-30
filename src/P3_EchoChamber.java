/*
	ISYS 320
	Name(s):
	Date: 
*/
import java.util.Scanner;
public class P3_EchoChamber {

	public static void main(String[] args) {
		System.out.println("What is your phrase?");
		Scanner console = new Scanner(System.in); 
		String phrase = console.nextLine(); 
		System.out.println("How many times to repeat?");
		int repeat = console.nextInt(); 
		for (int i = 1; i <= repeat; i++)
		{
			System.out.println(phrase);
		}
	}

}
