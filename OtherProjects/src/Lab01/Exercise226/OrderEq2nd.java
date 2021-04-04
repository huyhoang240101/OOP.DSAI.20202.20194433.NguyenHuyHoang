package Lab01.Exercise226;
import java.util.*;
public class OrderEq2nd {

	public static void main(String[] args) {
		System.out.print("2nd order equation has the form ax^2 + bx +c = 0. ");
		Scanner in = new Scanner(System.in);
	    System.out.println("Enter a:");
        float a  = in.nextFloat();  
        System.out.println("Enter b:");
        float b  = in.nextFloat();
        System.out.println("Enter c:");
        float c  = in.nextFloat();
        
        if (a==0) {
        	if (c==0) {
        		if (b==0) {
        			System.out.print("The equation have infinite solution");
        		}
        		else {
        			System.out.print("The equation have 1 solution x = 0");
        		}
        	}
        	else {
        		if (b==0) {
        			System.out.print("The equation have no solution");
        		}
        		else {
        			System.out.printf("The equqtion has one solution: %.2f%n", -c/b);
        		}
        	}
        }
        else {
        	float del = b*b - 4*a*c;
        	if (del < 0) {
        		System.out.print("The equation have no solution");
        	}
        	if (del == 0) {
        		System.out.printf("The equqtion has one solution x =: %.2f%n", -b/(2*a));
        	}
        	if (del > 0) {
        		System.out.printf("The equqtion has x1 = : %.2f%n", (-b + Math.sqrt(del))/(2*a));
        		System.out.printf("The equqtion has x2 = : %.2f%n", (-b - Math.sqrt(del))/(2*a));
        	}
        }
	}

}
