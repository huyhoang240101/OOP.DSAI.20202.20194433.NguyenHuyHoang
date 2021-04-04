package Lab01.NewJavaProject.src.abc;
import java.util.*;
public class Exercise4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number_of_days = 0;
		String MonthName = "Unknow month";
		
	    System.out.println("Enter a month number: ");
        int month  = input.nextInt();  
        System.out.println("Enter a year: ");
        int year  = input.nextInt();
        
        switch (month) {
        case 1:
        	MonthName = "January";
        	number_of_days = 31;
        	break;
        case 2:
        	MonthName = "February";
        	if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
        		number_of_days = 29;
        	}
        	else {
        		number_of_days = 28;
        	}
        	break;
        case 3:
        	MonthName = "March";
        	number_of_days = 31;
        	break;
        case 4:
        	MonthName = "April";
        	number_of_days = 30;
        	break;
        case 5:
        	MonthName = "May";
        	number_of_days = 31;
        	break;
        case 6:
        	MonthName = "June";
        	number_of_days = 30;
        	break;
        case 7:
        	MonthName = "July";
        	number_of_days = 31;
        	break;
        case 8:
        	MonthName = "August";
        	number_of_days = 31;
        	break;
        case 9:
        	MonthName = "September";
        	number_of_days = 30;
        	break;
        case 10:
        	MonthName = "October";
        	number_of_days = 31;
        	break;
        case 11:
        	MonthName = "November";
        	number_of_days = 30;
        	break;
        case 12:
        	MonthName = "December";
        	number_of_days = 31;
        	
        }
        System.out.print(MonthName + " " + year + " has " + number_of_days + " days\n");
	}

}
