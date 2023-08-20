package pp2;

import java.util.Scanner;

public class dayName {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day to be check");
		
		System.out.println("sunday,monday.tuesday,wednesday,thursday,friday,saturday: ");
		String day = sc.next();
		sc.close();
		switch (day) {
		case "sunday":
			System.out.println("Yayy, its a weekend");
			break;
		case "monday":
			System.out.println("Uff,its a weekday");
			break;
		case "tuesday":
			System.out.println("Uff,its a weekday");
			break;
		case "wednesday":
			System.out.println("Uff,its a weekday");
			break;
		case "thursday":
			System.out.println("Uff,its a weekday");
			break;
		case "friday":
			System.out.println("Uff,its a weekday");
			break;
		case "saturday":
			System.out.println("Yayy, its a weekend");
			break;
		default:
			System.out.println("day not found");
			break;
		}
	}
}