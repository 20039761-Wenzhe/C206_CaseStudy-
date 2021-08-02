import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<Car>();
		ArrayList<Feedback> feedbackList = new ArrayList<Feedback>();
		ArrayList<Account> accountList = new ArrayList<Account>();
		ArrayList<Appointment> appList = new ArrayList<Appointment>();

		carList.add(new Car(1, "Traxxas Rustler", "Blue", 79));
		carList.add(new Car(2, "Arrma Typhon", "Red", 68));
		feedbackList.add(new Feedback("Cashback not given yet", "Pending", "Zhou Ye"));
		feedbackList.add(new Feedback("Wrong amount charged for the Car", "Pending", "Jackey Tan"));
		accountList.add(new Account(1, "Shy Chan", 83339188));
		accountList.add(new Account(2, "Shirley Moh", 84449111));
		accountList.add(new Account(3, "Jackey Tan", 83339188));
		accountList.add(new Account(4, "Zhou Ye", 92349988));
		appList.add(new Appointment(1, "Shy Chan", "04/09/21-2.45pm"));
		appList.add(new Appointment(2, "Shirley Moh", "10/09/21-4.45pm"));

		int option = 0;

		while (option != 5) {
			menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				carMenu();
			} else if (option == 2) {
				feedbackMenu(feedbackList);
			} else if (option == 3) {
				accountMenu();
			} else if (option == 4) {
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
		// jasmine write code here
	}

	private static void feedbackMenu(ArrayList<Feedback> feedbackList){
		// wenzhe write code here
		System.out.println("1. View feedback");
		System.out.println("2. Add feedback");
		System.out.println("3. Delete feedback");
		int input = Helper.readInt("Enter an option > ");
		
		String output = String.format("%-10s %-35s %-10s %-10s\n", "No.", "Issue", "Status", "Name");

		if (input == 1) {
			int counter = 0;
			for (int i = 0; i < feedbackList.size(); i++) {
				counter = counter +1;
				output += String.format("%-10d %-35s %-10s %-10s\n", counter,feedbackList.get(i).getIssue(), feedbackList.get(i).getStatus(), feedbackList.get(i).getName());
				
			}
			System.out.println(output);
		}
		if(input == 1) {
			String issue = Helper.readString("Enter Issue > ");
			String status = Helper.readString("Enter Status > ");
			String name = Helper.readString("Name > ");
		}
	}

	private static void accountMenu() {
		// miguel write code here
	}

	private static void appMenu() {
		// wenjie write code here
	}
}
