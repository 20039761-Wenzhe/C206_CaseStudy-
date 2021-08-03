import java.util.ArrayList;



public class C206_CaseStudy {

	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<Car>();
		ArrayList<Feedback> feedbackList = new ArrayList<Feedback>();
		ArrayList<Issue> issueList = new ArrayList<Issue>();
		ArrayList<Account> accountList = new ArrayList<Account>();
		ArrayList<Appointment> appList = new ArrayList<Appointment>();

		carList.add(new Car("Traxxas Rustler", "Blue", 79));
		carList.add(new Car("Arrma Typhon", "Red", 68));
		issueList.add(new Issue("Zhou Ye", "Cashback not given yet", "Pending"));
		issueList.add(new Issue("Jackey Tan", "Wrong amount charged for the Car", "Solving"));
		feedbackList.add(new Feedback("Jisoo", "Good customer service"));
		feedbackList.add(new Feedback("Shy Chan", "Items are overpriced"));
		accountList.add(new Account("Shy Chan", 83339188));
		accountList.add(new Account("Jisoo", 84449111));
		accountList.add(new Account("Jackey Tan", 83339188));
		accountList.add(new Account("Zhou Ye", 92349988));
		appList.add(new Appointment("Shy Chan", "04/09/21-2.45pm"));
		appList.add(new Appointment("Jisoo", "10/09/21-4.45pm"));

		int option = 0;

		while (option != 5) {
			menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				carMenu();
			} else if (option == 2) {
				feedbackMenu(feedbackList, issueList);
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

	private static void feedbackMenu(ArrayList<Feedback> feedbackList, ArrayList<Issue> issueList){
		// wenzhe write code here
		System.out.println("1. View");
		System.out.println("2. Add");
		System.out.println("3. Delete");
		int input = Helper.readInt("Enter an option > ");
		
		String output = String.format("%-5s %-15s %-35s %-10s\n", "No.", "Name", "Issue", "Status");
		String output1 = String.format("%-10s %-10s %-15s\n", "No. ", "Name", "Feedback");
		int counter = 0;

		if (input == 1) {
			System.out.println("1. View Issue");
			System.out.println("2. View Feedback");
			int input1 = Helper.readInt("Enter an option > ");
			if (input1 == 1) {
				for(int i =0; i < issueList.size(); i++) {
					counter = counter +1;
				output += String.format("%-5d %-15s %-35s %-10s\n", counter, issueList.get(i).getName(), issueList.get(i).getIssue(), issueList.get(i).getStatus());	
			}
			System.out.println(output);
		}
			if(input1 == 2) {
				for(int i =0; i < feedbackList.size(); i++) {
				counter = counter +1;
				output1 += String.format("%-10d %-10s %-15s\n", counter,feedbackList.get(i).getName(), feedbackList.get(i).getFeedback());	
				}
				System.out.println(output1);
			}
		}
		if (input == 2) {
			System.out.println("1. Add Issue");
			System.out.println("2. Add Feedback");
			int input1 = Helper.readInt("Enter an option > ");
			
			if (input1 == 1) {
				String name = Helper.readString("Name > ");
				String issue = Helper.readString("Enter Issue > ");
				String status = Helper.readString("Enter Status > ");
				issueList.add(new Issue(name, issue, status));
				System.out.println("New Issue added!");
			}
			if (input1 == 2) {
				String name = Helper.readString("Name > ");
				String feedback = Helper.readString("Enter feedback > ");
				feedbackList.add(new Feedback(name, feedback));
				System.out.println("New feedback added!");
			}
		
		}
		if (input == 3) {
			System.out.println("1. Delete Issue");
			System.out.println("2. Delete Feedback");
			int input1 = Helper.readInt("Enter an option > ");
			
			if(input1 == 1) {
				int number = Helper.readInt("Enter issue no. to delete > ");
				issueList.remove(number - 1);
				System.out.println("Issue " + number + " removed");
			}
			if (input1 == 2) {
			int number = Helper.readInt("Enter feedback no. to delete > ");
			feedbackList.remove(number - 1);
			System.out.println("Feedback " + number + " removed");
		}
		}
		
	}
	private static void accountMenu() {
		// miguel write code here
	}

	private static void appMenu() {
		// wenjie write code here
	}
}
