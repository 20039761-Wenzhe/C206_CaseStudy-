import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import java.util.ArrayList;
import java.util.regex.Pattern;

import org.junit.Test;



public class C206_CaseStudy {
	private static ArrayList<Car> carList = new ArrayList<Car>();
	private static ArrayList<Feedback> feedbackList = new ArrayList<Feedback>();
	private static ArrayList<Issue> issueList = new ArrayList<Issue>();
	private static ArrayList<Account> accountList = new ArrayList<Account>();
	private static ArrayList<Appointment> appList = new ArrayList<Appointment>();


	public static void main(String[] args) {

		

		int option = 0;

		while (option != 5) {
			menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
					Helper.line(40, "-");
					System.out.println("1. View Car");
					System.out.println("2. Add Car");
					System.out.println("3. Delete Car");
					Helper.line(40, "-");
					
					
					int input = Helper.readInt("Enter an option > ");
					if(input == 1) {
						C206_CaseStudy.viewCar(carList);
					}
					else if(input == 2) {
						Car car1 = addCar(carList);
						carAdded(carList, car1);
					}
					else if(input == 3) {
						int ID = deleteInput(carList);
						C206_CaseStudy.deleteCar(carList, ID);
					}			
			
			} else if (option == 2) {
                System.out.println("1. View");
                System.out.println("2. Add");
                System.out.println("3. Delete");
                System.out.println("4. Update");
                
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
                        int id = inputDelete(issueList);
                        C206_CaseStudy.deleteIssue(issueList, id);
                    }
                    if (input1 == 2) {
                        int id = inputDeleteF(feedbackList);
                        C206_CaseStudy.deleteFeedback(feedbackList, id);
                    }

                }
                if(input == 4) {
                	replyFeedback(feedbackList);
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
			if(input == 3) {
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
			if(input == 3) {
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
	
	public static String retrieveAllCar(ArrayList<Car> carList) {
		// jasmine write code here
		String output = "";
		for (int i=0; i<carList.size(); i++) {
			output+= String.format("%-5d %-20s %-15s %-10s\n", carList.get(i).getID(), carList.get(i).getName(), carList.get(i).getColour(), carList.get(i).getPrice());
		}
		return output;
	}
	
	public static void viewCar(ArrayList<Car> carList) {
		// jasmine write code here
		String output = String.format("%-5s %-20s %-15s %-10s\n", "ID", "Name", "Colour", "Price");
		output += retrieveAllCar(carList);
		System.out.println(output);
	}
	
	
	public static Car addCar(ArrayList<Car> carList) {
		// jasmine write code here
		int ID = Helper.readInt("ID >");
		String name = Helper.readString("Name > ");
		String colour = Helper.readString("Enter Colour > ");
		int price = Helper.readInt("Enter Price > ");
		Car car1 = new Car(ID, name, colour, price);
		return car1;
	}
	
	public static void carAdded(ArrayList<Car> carList, Car car1) {
		//jasmine
		carList.add(car1);
		System.out.println("New Radio Car Successfully added!");
	}
	
	public static int deleteInput(ArrayList<Car>carList) {
		//jasmine 
		int ID = Helper.readInt("Enter ID of Radio Car to delete > ");
		return ID;
	}
	
	public static void deleteCar(ArrayList<Car> carList, int ID) {
		// jasmine write code here
		for (Car c : carList) {
			if(ID==c.getID()) {
				carList.remove(c);
				System.out.println("Radio Car ID: "+c.getID()+" Succesfully deleted!");
			}
			 if (ID!=c.getID()){
				System.out.println("Unable to find Car with ID: ' "+ID+" '.");
			}
		}
	}

	public static String retrieveAllIssue(ArrayList<Issue> issueList) {
        String output = "";
        for (int i = 0; i < issueList.size(); i++) {
            output += String.format("%-5s %-15s %-35s %-10s\n", issueList.get(i).getId(), issueList.get(i).getName(),
                    issueList.get(i).getIssue(), issueList.get(i).getStatus());
        }
        return output;
    }

    public static void viewAllIssue(ArrayList<Issue> issueList) {
        String output = String.format("%-5s %-15s %-35s %-10s\n", "No.", "Name", "Issue", "Status");
        output += retrieveAllIssue(issueList);
        System.out.println(output);
    }

    public static String retrieveAllFeedback(ArrayList<Feedback> feedbackList) {
        String output = "";
        for (int i = 0; i < feedbackList.size(); i++) {
            output += String.format("%-10d %-10s %-25s %-30s\n", feedbackList.get(i).getId(),
                    feedbackList.get(i).getName(), feedbackList.get(i).getFeedback(), feedbackList.get(i).getReply());
        }
        return output;
    }

    public static void viewAllFeedback(ArrayList<Feedback> feedbackList) {
        String output = String.format("%-10s %-10s %-25s %-30s\n", "No. ", "Name", "Feedback", "Reply");
        output += retrieveAllFeedback(feedbackList);
        System.out.println(output);
    }

    public static Issue inputIssue() {
        int id = Helper.readInt("Enter issue id > ");
        String name = Helper.readString("Name > ");
        String issue = Helper.readString("Enter Issue > ");
        String status = Helper.readString("Enter Status > ");

        Issue is = new Issue(id, name, issue, status);
        return is;
    }

    public static void addIssue(ArrayList<Issue> issueList, Issue is) {
        issueList.add(is);
        System.out.println("Issue added");
    }

    public static Feedback inputFeedback() {
        int id = Helper.readInt("Enter feedback id > ");
        String name = Helper.readString("Name > ");
        String feedback = Helper.readString("Enter feedback > ");

        Feedback fb = new Feedback(id, name, feedback, "");
        return fb;
    }

    public static void addFeedback(ArrayList<Feedback> feedbackList, Feedback fb) {
        feedbackList.add(fb);
        System.out.println("Feedback added");
    }

    public static int inputDelete(ArrayList<Issue> issueList) {
        int id = Helper.readInt("Enter Issue No. to delete > ");
        return id;
    }

    public static void deleteIssue(ArrayList<Issue> issueList, int id) {
        for (int i = 0; i < issueList.size(); i++) {
            Issue is = issueList.get(i);
            if (id == is.getId()) {
                issueList.remove(i);
                System.out.println("Issue deleted");
            } else {
                System.out.println("Issue not found");
            }
        }
    }

    public static int inputDeleteF(ArrayList<Feedback> feedbackList) {
        int id = Helper.readInt("Enter Feedback No. to delete > ");
        return id;
    }

    public static void deleteFeedback(ArrayList<Feedback> feedbackList, int id) {
        for (int i = 0; i < feedbackList.size(); i++) {
            Feedback fb = feedbackList.get(i);
            if (id == fb.getId()) {
                feedbackList.remove(fb);
                System.out.println("Feedback deleted");
            }
        }
    }

    public static void replyFeedback(ArrayList<Feedback> feedbackList) {
        int no = Helper.readInt("Enter feedback no. to reply to > ");
        String output = String.format("%-10s %-10s %-25s %-30s\n", "No. ", "Name", "Feedback", "Reply");
        for (int i = 0; i < feedbackList.size(); i++) {
            Feedback fb = feedbackList.get(i);
            if (no == fb.getId()) {
                output += String.format("%-10d %-10s %-25s %-30s\n", feedbackList.get(i).getId(),
                        feedbackList.get(i).getName(), feedbackList.get(i).getFeedback(),
                        feedbackList.get(i).getReply());
                System.out.println(output);
                String reply = Helper.readString("Enter reply > ");
                for (Feedback fr : feedbackList) {
                    if (no == fr.getId())
                        fr.setReply(reply);
                    System.out.println("Reply added!");

                }
            } else {
                System.out.println("Feedback ID cannot be found");
            }
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
