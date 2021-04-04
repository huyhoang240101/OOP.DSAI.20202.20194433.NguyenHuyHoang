package Lab01.NewJavaProject.src.abc;
import java.util.Arrays;
public class Exercise5 {

	public static void main(String[] args) {
		int[] array = {
				1789, 2035, 1899, 1456, 2013};
		System.out.println("Original numeric array : "+Arrays.toString(array));
	    Arrays.sort(array);
	    System.out.println("Sorted numeric array : "+Arrays.toString(array));
	    
	    int sum = 0;
	       for(int i=0; i < array.length ; i++)
	        sum = sum + array[i];
	    System.out.println("Sum of the array elements is : " + sum);
	    
	    double average = sum / array.length;
	    System.out.println("Average value of the array elements is : " + average);
	}

}
