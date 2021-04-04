package Lab01;
import java.util.*;
class Exercise225 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    System.out.println("Enter 1st number:");
        float num1  = in.nextFloat();  
        System.out.println("Enter 2nd number:");
        float num2  = in.nextFloat();
        
        float sum = num1 + num2;
        float dif = num1 - num2;
        float pro = num1 * num2;
        
        System.out.printf("Sum of two numbers: %.2f%n", sum);
        System.out.printf("Difference of two numbers: %.2f%n", dif);
        System.out.printf("Product of two numbers: %.2f%n", pro);

        if (num2 == 0) {
        	System.out.print("Can not devide with 0");
        }
        else {
        	float quo = num1/num2;
        	System.out.printf("Quotient of two dounble numbers: %.2f%n", quo);
        }
        		
	}

}
