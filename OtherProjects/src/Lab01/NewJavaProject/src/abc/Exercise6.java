package Lab01.NewJavaProject.src.abc;
import java.util.Scanner;
public class Exercise6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    System.out.println("Enter the number of rows of matrix: ");
        int row  = in.nextInt();  
        System.out.println("Enter the number of columns of matrix: ");
        int col  = in.nextInt();
        
        int array1[][] = new int[row][col];
        int array2[][] = new int[row][col];
        int sum[][] = new int[row][col];
        
        System.out.println("Enter elements of 1st matrix");
        int m, n;
        for (m=0; m<row; m++)
        	for (n=0; n<col; n++)
        		array1[m][n] = in.nextInt();
        
        System.out.println("Enter elements of 2nd matrix");
        for (m=0; m<row; m++)
        	for (n=0; n<col; n++)
        		array2[m][n] = in.nextInt();
        
        for (m=0; m<row; m++)
        	for (n=0; n<col; n++)
        		sum[m][n] = array1[m][n] + array2[m][n];
    	
        System.out.println("Sum of the two matrices:");
        for (m=0; m<row; m++) {
        	for (n=0; n<col; n++)
        		System.out.print(sum[m][n]+"\t");
        	System.out.println();
        }
        	
	}

}
