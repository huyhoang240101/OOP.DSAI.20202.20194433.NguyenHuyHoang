package Lab01.JavaBasics.src.abc;
import java.util.*;
public class InputFromKeyborad {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    System.out.println("What's your name?");
        String name  = in.nextLine();  
        System.out.println("How old are you?");
        int age  = in.nextInt();
        System.out.println("How tall are you? (m)");
        double height = in.nextDouble();
        
        System.out.println("Mr/Mrs. " + name + ", " + age + " years old. " + "Your height is " + height + ".");
	}

}
