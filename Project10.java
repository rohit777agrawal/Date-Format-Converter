import java.util.Scanner;

public class Project10 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//create storage for date
		String date;
		System.out.println("Enter a date in the format MM/DD/YYYY");
		//allow user to input date
		Scanner keyboard = new Scanner(System.in);
		date = keyboard.nextLine();
		//create substring of date
		int firstbackslash = date.indexOf("/");
		int lastbackslash = date.lastIndexOf("/");
		String month = date.substring(0,firstbackslash);
		String day = date.substring(firstbackslash+1, lastbackslash);
		String year = date.substring(lastbackslash+1);
		//show the result 
		System.out.println(day + "." + month + "." + year);

	}
	
}
