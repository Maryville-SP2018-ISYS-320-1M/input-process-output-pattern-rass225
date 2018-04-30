/*
	ISYS 320
	Name(s):
	Date: 
*/
import java.util.Scanner;
public class P4_ScalableBox {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("What is the height? ");
		int height = sc.nextInt();
		System.out.print("What is the width? ");
		int width = sc.nextInt();
		
		drawBoxCap(width);
		drawBoxInsides(height, width);
		drawBoxCap(width);
	}
	public static void drawBoxCap(int width) {
		System.out.print("+");		
		for( int outsideIndex = 1; outsideIndex <= width - 2; outsideIndex++ ) {
			System.out.print("-");
		}		
		System.out.println("+");
	}
	public static void drawBoxInsides(int height, int width) {
		for( int insideRowIndex = 1; insideRowIndex <= height - 2; insideRowIndex++ ) {
			drawBoxInsideLine(width);
		}
	}
	public static void drawBoxInsideLine(int width) {
		System.out.print("|");
		for( int insideRowIndex = 1; insideRowIndex <= width - 2; insideRowIndex++ ) {
			System.out.print(".");
		}		
		System.out.println("|");
	}
}
