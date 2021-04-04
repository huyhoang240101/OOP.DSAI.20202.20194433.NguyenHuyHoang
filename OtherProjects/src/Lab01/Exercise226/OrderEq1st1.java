package Lab01.Exercise226;
import java.util.*;
public class OrderEq1st1 {

	public static void main(String[] args) {
		System.out.print("1st order equation has the form ax + b = 0. ");
		Scanner in = new Scanner(System.in);
	    System.out.println("Enter a:");
        float a  = in.nextFloat();  
        System.out.println("Enter b:");
        float b  = in.nextFloat();
		
        if (a==0){
        	if (b==0) {
				System.out.print("The equation have infinite solution");
			}
        	else {
        		System.out.print("The equation have no solution");
        	}
        }
        else {
        	System.out.printf("The equqtion has one solution: %.2f%n", -b/a);
        }

	}

}
