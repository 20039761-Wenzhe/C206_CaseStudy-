import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import java.util.ArrayList;
import java.util.regex.Pattern;

import org.junit.Test;



public class C206_CaseStudy {
	private static final String status_Pattern = "(Pending|Solved)";


	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<Car>();
		ArrayList<Feedback> feedbackList = new ArrayList<Feedback>();
		ArrayList<Issue> issueList = new ArrayList<Issue>();
		ArrayList<Account> accountList = new ArrayList<Account>();
		ArrayList<Appointment> appList = new ArrayList<Appointment>();
		
		carList.add(new Car("Traxxas Rustler", "Blue", 79));
		carList.add(new Car("Arrma Typhon", "Red", 68));
		issueList.add(new Issue("Zhou Ye", "Cashback not given yet", "Pending"));
		issueList.add(new Issue("Jackey Tan", "Wrong amount charged for the Car", "Solved"));
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
				System.out.println("1. View Car");
				System.out.println("2. Add Car");
				System.out.println("3. Delete Car");
				
				int input = Helper.readInt("Enter an option > ");
			if(input == 1) {
				viewCar(carList);
			}
			if(input == 2) {
				addCar(carList);
			}
			if(input == 2) {
				deleteCar(carList);
			}
			
			} else if (option == 2) {
				System.out.println("1. View");
				System.out.println("2. Add");
				System.out.println("3. Delete");
				
				int input = Helper.readInt("Enter an option > ");
				
				
				if(input == 1) {
					System.out.println("1. View Issue");
					System.out.println("2. View Feedback");
					int input1 = Helper.readInt("Enter an option > ");
					if (input1 == 1) {
						C206_CaseStudy.viewAllIssue(issueList);
						
				}
					else if(input1 == 2) {
						C206_CaseStudy.viewAllFeedback(feedbackList);
					}
				}
				if(input == 2) {
					System.out.println("1. Add Issue");
					System.out.println("2. Add Feedback");
					int input1 = Helper.readInt("Enter an option > ");
					if (input1 == 1) {
						Issue is = inputIssue();
						C206_CaseStudy.addIssue(issueList, is);
					}
					if (input1 == 2) {
						Feedback fb = inputFeedback();
						C206_CaseStudy.addFeedback(feedbackList, fb);
					}
				}
				if(input == 3) {
					System.out.println("1. Delete Issue");
					System.out.println("2. Delete Feedback");
					int input1 = Helper.readInt("Enter an option > ");
					if (input1 == 1) {
	
						C206_CaseStudy.deleteIssue(issueList, number);
					}
					if (input1 == 2) {
						int number = Helper.readInt("Enter feedback no. to remove > ");
						C206_CaseStudy.deleteFeedback(feedbackList, number);
					}
				}
		
			}
	
			else if (option == 3) {
				System.out.println("1. View Account");
				System.out.println("2. Add Account");
				System.out.println("3. Delete Account");
				
				int input = Helper.readInt("Enter an option > ");
			if(input == 1) {
				viewAccount(accountList);
			}
			if(input == 2) {
				addAccount(accountList);
			}
			if(input == 2) {
				deleteAccount(accountList);
			}
		}
			else if (option == 4) {
				System.out.println("1. View Appointment");
				System.out.println("2. Add Appointment");
				System.out.println("3. Delete Appointment");
				
				int input = Helper.readInt("Enter an option > ");
			if(input == 1) {
				viewAppointment(appList);
			}
			if(input == 2) {
				addAppointment(appList);
			}
			if(input == 2) {
				deleteAppointment(appList);
			}
		}
			else if(option == 5) {
				System.out.println("Application closed!");
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
	public static void viewCar(ArrayList<Car> carList) {
		// jasmine write code here
		String output = String.format("%-5s %-10s %-5s", "Name", "Colour", "Price");
		int counter =0;
		for (int i=0; i<carList.size(); i++) {
			counter = counter + 1;
			output+= String.format("%-5d %-15s %-35s %-10s\n", counter, carList.get(i).getName(), carList.get(i).getColour(), carList.get(i).getPrice());
		}
		System.out.println(output);
	}
	
	public static void addCar(ArrayList<Car> carList) {
		// jasmine write code here
		String name = Helper.readString("Name > ");
		String colour = Helper.readString("Enter Colour > ");
		int price = Helper.readInt("Enter Price > ");
		carList.add(new Car(name, colour, price));
		System.out.println("New Radio Car added!");
	}
	public static void deleteCar(ArrayList<Car> carList) {
		// jasmine write code here
		int name = Helper.readInt("Enter Name of Radio Car to delete > ");
		carList.remove(name - 1);
		System.out.println("Radio Car " + name + " removed.");
	}
	public static String retrieveAllIssue(ArrayList<Issue>issueList) {
		String output = "";
		int counter = 0;
		for(int i = 0; i < issueList.size(); i++) {
			counter = counter + 1;
			output += String.format("%-5s %-15s %-35s %-10s\n", counter, issueList.get(i).getName(),issueList.get(i).getIssue(), issueList.get(i).getStatus());
		}
		return output;
	}
	public static void viewAllIssue(ArrayList<Issue>issueList) {
		String output = String.format("%-5s %-15s %-35s %-10s\n", "No.", "Name", "Issue", "Status");
		output += retrieveAllIssue(issueList);
		System.out.println(output);
	}
	public static String retrieveAllFeedback(ArrayList<Feedback>feedbackList) {
		String output = "";
		int counter = 0;
		for(int i = 0; i < feedbackList.size(); i++) {
			counter = counter + 1;
			output += String.format("%-10d %-10s %-15s\n", counter,feedbackList.get(i).getName(), feedbackList.get(i).getFeedback());
		}
		return output;
	}
	public static void viewAllFeedback(ArrayList<Feedback>feedbackList) {
		String output = String.format("%-10s %-10s %-15s\n", "No. ", "Name", "Feedback");
		output += retrieveAllFeedback(feedbackList);
		System.out.println(output);
	}
	public static Issue inputIssue() {
		String name = Helper.readString("Name > ");
		String issue = Helper.readString("Enter Issue > ");
		String status = Helper.readString("Enter Status > ");
		
		Issue is = new Issue(name, issue, status);
		return is;
	}
	public static void addIssue(ArrayList<Issue> issueList, Issue is) {
		issueList.add(is);
		System.out.println("Issue added");
	}
	public static Feedback inputFeedback() {
		String name = Helper.readString("Name > ");
		String feedback = Helper.readString("Enter feedback > ");
		
		Feedback fb = new Feedback(name, feedback);
		return fb;
	}
	public static void addFeedback(ArrayList<Feedback> feedbackList, Feedback fb) {
		feedbackList.add(fb);
		System.out.println("Feedback added");
	}
	public static String InputDeleteIssue() {
	String name = Helper.readString("Enter name of isssue to remove > ");
		return name;
	}
	public static void deleteIssue(ArrayList<Issue>issueList, Issue name) {
	for(int i = 0; i < issueList.size(); i++) {
		Issue issuename = issueList.get(i);
		if (name.equals(issuename.getName())) {
			String output =  "";
			output += String.format("%-15s %-35s %-10s\n", issuename.getName(),
					issuename.getIssue(), issuename.getStatus());
			System.out.println(output);
			String option = Helper.readString("Do you wish to delete this issue? (Y/N)> ");
			if (option.equalsIgnoreCase("y")) {
				issueList.remove(name);
				System.out.println("Issue has been successfully removed!");
			
		}
	}
	}
	public static void deleteFeedback(ArrayList<Feedback>feedbackList, int number) {
		if(number > feedbackList.size()) {
			System.out.println("Feedback not found");
		}
		else {
		feedbackList.remove(number - 1);
		System.out.println("Feedback " + number + " removed");
		}
	}
	public static void viewAccount(ArrayList<Account> accountList) {
		// miguel write code here
		String output99 = String.format("%-10s %-10d\n", "Name ", "No.");
		int counter = 0;
				for(int i =0; i < accountList.size(); i++) {
					counter = counter +1;
					output99 += String.format("%-10s %-30s %-10d\n", counter, accountList.get(i).getName(), accountList.get(i).getMobile());
				}
				System.out.println(output99);
	}
	public static void addAccount(ArrayList<Account> accountList) {
		// miguel write code here
		
		String name = Helper.readString("Name > ");
		int mobile = Helper.readInt("Enter mobile number > ");
		accountList.add(new Account(name, mobile));
		System.out.println("New account added!");
	}
	public static void deleteAccount(ArrayList<Account> accountList) {
		// miguel write code here
		int mobile = Helper.readInt("Enter Account mobile to delete > ");
		accountList.remove(mobile - 1);
		System.out.println("Account " + mobile + " removed");
	}
	public static void viewAppointment(ArrayList<Appointment> appList) {
		// wenjie write code here
	}
	public static void addAppointment(ArrayList<Appointment> appList) {
		// wenjie write code here
	}
	public static void deleteAppointment(ArrayList<Appointment> appList) {
		// wenjie write code here
	}
	
	
	
	
	

	
}
