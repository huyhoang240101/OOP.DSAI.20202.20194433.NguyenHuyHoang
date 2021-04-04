package Lab01.JavaBasics.src.abc;
import java.util.*;
public class TriangleDis {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    System.out.println("Enter an integer:");
        int n  = in.nextInt();
        displayTriangle(n);
        
	}
	public static void displayTriangle(int n) {
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.print(" ");
			}
			for (int k=0; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
