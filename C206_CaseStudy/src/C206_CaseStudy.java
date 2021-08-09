import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import java.util.ArrayList;

import org.junit.Test;



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
						viewIssue(issueList);
						
				}
					else if(input == 2) {
						viewFeedback(feedbackList);
					}
				}
				if(input == 2) {
					System.out.println("1. Add Issue");
					System.out.println("2. Add Feedback");
					int input1 = Helper.readInt("Enter an option > ");
					
					if (input1 == 1) {
						addIssue(issueList);
					}
					else if(input == 2) {
						addFeedback(feedbackList);
					}
				}
				if(input == 3) {
					System.out.println("1. Delete Issue");
					System.out.println("2. Delete Feedback");
					int input1 = Helper.readInt("Enter an option > ");
					
					if(input1 == 1) {
						deleteIssue(issueList);
					}
					else if(input1 == 2) {
						deleteFeedback(feedbackList);
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

	private static void viewCar(ArrayList<Car> carList) {
		// jasmine write code here
		
	}
	private static void addCar(ArrayList<Car> carList) {
		// jasmine write code here
		
	}
	private static void deleteCar(ArrayList<Car> carList) {
		// jasmine write code here
		
	}

	private static void viewIssue(ArrayList<Issue> issueList){
		// wenzhe write code here
		String output = String.format("%-5s %-15s %-35s %-10s\n", "No.", "Name", "Issue", "Status");
		int counter = 0;
				for(int i =0; i < issueList.size(); i++) {
					counter = counter +1;
				output += String.format("%-5d %-15s %-35s %-10s\n", counter, issueList.get(i).getName(), issueList.get(i).getIssue(), issueList.get(i).getStatus());
				System.out.println(output);
				}		
	}
	private static void viewFeedback(ArrayList<Feedback> feedbackList){
		// wenzhe write code here
		String output1 = String.format("%-10s %-10s %-15s\n", "No. ", "Name", "Feedback");
		int counter = 0;
				for(int i =0; i < feedbackList.size(); i++) {
					counter = counter +1;
					output1 += String.format("%-10d %-10s %-15s\n", counter,feedbackList.get(i).getName(), feedbackList.get(i).getFeedback());
				System.out.println(output1);
				}		
	}
	private static void addIssue(ArrayList<Issue> issueList){
		String name = Helper.readString("Name > ");
		String issue = Helper.readString("Enter Issue > ");
		String status = Helper.readString("Enter Status > ");
		issueList.add(new Issue(name, issue, status));
		System.out.println("New Issue added!");
	}
	private static void addFeedback(ArrayList<Feedback> feedbackList){
		String name = Helper.readString("Name > ");
		String feedback = Helper.readString("Enter feedback > ");
		feedbackList.add(new Feedback(name, feedback));
		System.out.println("New feedback added!");
	}
	private static void deleteIssue(ArrayList<Issue> issueList){
		int number = Helper.readInt("Enter issue no. to delete > ");
		issueList.remove(number - 1);
		System.out.println("Issue " + number + " removed");
	}
	private static void deleteFeedback(ArrayList<Feedback> feedbackList){
		int number = Helper.readInt("Enter feedback no. to delete > ");
		feedbackList.remove(number - 1);
		System.out.println("Feedback " + number + " removed");
	}
	
	
	
			
	private static void viewAccount(ArrayList<Account> accountList) {
		// miguel write code here
		
		assertNotNull("Test if there is valid Account arraylist to add to", accountList);
		
		String output99 = String.format("%-10s %-10d\n", "Name ", "No.");
		int counter = 0;
				for(int i =0; i < accountList.size(); i++) {
					counter = counter +1;
					output99 += String.format("%-10s %-10d\n", counter, accountList.get(i).getName(), accountList.get(i).getMobile());
				System.out.println(output99);
				}
	}
	private static void addAccount(ArrayList<Account> accountList) {
		// miguel write code here
		
		assertNotNull("Test if there is valid Account arraylist to add to", accountList);
		
		String name = Helper.readString("Name > ");
		int mobile = Helper.readInt("Enter mobile number > ");
		accountList.add(new Account(name, mobile));
		System.out.println("New account added!");
	}
	private static void deleteAccount(ArrayList<Account> accountList) {
		// miguel write code here
		int mobile = Helper.readInt("Enter Account mobile to delete > ");
		accountList.remove(mobile - 1);
		System.out.println("Account " + mobile + " removed");
	}

	private static void viewAppointment(ArrayList<Appointment> appList) {
		// wenjie write code here
	}
	private static void addAppointment(ArrayList<Appointment> appList) {
		// wenjie write code here
	}
	private static void deleteAppointment(ArrayList<Appointment> appList) {
		// wenjie write code here
	}
	
	
	
	
	

	
}
