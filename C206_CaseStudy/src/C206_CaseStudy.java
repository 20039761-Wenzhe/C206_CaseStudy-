import java.util.ArrayList;

import ESEP1.Helper;

public class C206_CaseStudy {

	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<Car>();
		ArrayList<Feedback> feedbackList = new ArrayList<Feedback>();
		ArrayList<Account> accountList = new ArrayList<Account>();
		ArrayList<Appointment> appList = new ArrayList<Appointment>();
		
		carList.add(new Car(1, "Traxxas Rustler", "Blue", 79));
		carList.add(new Car(2, "Arrma Typhon", "Red", 68));
		feedbackList.add(new Feedback(1, "Cashback not given yet", "Pending"));
		feedbackList.add(new Feedback(2, "Wrong amount charged for the Car", "Pending"));
		accountList.add(new Account(1, "Kok Peng", 83339188));
		accountList.add(new Account(2, "Shirley Moh", 84449111));
		accountList.add(new Account(3, "Jackey Tan", 83339188));
		accountList.add(new Account(4, "Zhou Ye", 92349988));
		appList.add(new Appointment(1, "Kok Peng", "Wednesday-2.45pm"));
		appList.add(new Appointment(2, "Shirley Moh", "Friday-4.45pm"));
	
	int option = 0;

	while (option != 5) {
		menu();
		option = Helper.readInt("Enter an option > ");
		
		if (option == 1) {
			carMenu();
		} else if(option == 2) {
			feedbackMenu();
		} else if(option == 3) {
			accountMenu();
		} else if(option == 4) {
			appMenu();
		} else if (option == 5) {
			System.out.println("Application closed");
		}
	}
	}
		private static void menu() {
			Helper.line(80, "=");
			System.out.println("Radio Control Car APP");
			Helper.line(80, "=");
			System.out.println("1. DISPLAY Radio control car Listing and Features Option Menu ");
			System.out.println("2. DISPLAY Feedback Option Menu ");
			System.out.println("3. DISPLAY Visitor Registration Option Menu ");
			System.out.println("4. DISPLAY Appointment Option Menu ");
			System.out.println("5. Quit");
		}
		private static void carMenu() {
	}
		private static void feedbackMenu() {
	}
		private static void accountMenu() {
	}
		private static void appMenu() {
	}
	}
