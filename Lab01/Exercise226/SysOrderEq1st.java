package abc;
import java.util.*;
public class SysOrderEq1st {

	public static void main(String[] args) {
		System.out.print("1st order system of equation has the form a11x1 + a12x2= b1 and a21x1 + a22x2= b2.  ");
		Scanner in = new Scanner(System.in);
	    System.out.println("Enter a11:");
        float a11  = in.nextFloat();  
        System.out.println("Enter a12:");
        float a12  = in.nextFloat();
        System.out.println("Enter b1:");
        float b1  = in.nextFloat();  
        System.out.println("Enter a21:");
        float a21  = in.nextFloat();  
        System.out.println("Enter a22:");
        float a22  = in.nextFloat();
        System.out.println("Enter b2:");
        float b2  = in.nextFloat(); 
        
        float d = a11*a22 - a12*a21;
        float d1 = b1*a22 - b2*a12;
        float d2 = b2*a11 - a21*b1;
        
        if (d==0) {
        	System.out.print("The system of equation have no solution");
        }
        else {
        	System.out.printf("The equqtion has x1 = : %.2f%n", d1/d);
        	System.out.printf("The equqtion has x2 = : %.2f%n", d2/d);
        }
	}

}
