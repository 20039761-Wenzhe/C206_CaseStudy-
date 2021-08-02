import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<Car>();
		ArrayList<Feedback> feedbackList = new ArrayList<Feedback>();
		ArrayList<Account> accountList = new ArrayList<Account>();
		ArrayList<Appointment> appList = new ArrayList<Appointment>();
		
		carList.add(new Car(1, "Traxxas Rustler", "50km/hr", 79));
		carList.add(new Car(2, "Arrma Typhon", "45km/hr", 68));
		feedbackList.add(new Feedback(1, "Cashback not given yet", "Pending"));
		feedbackList.add(new Feedback(2, "Wrong amount charged for the Car", "Pending"));
		accountList.add(new Account(1, "Kok Peng", 83339188));
		accountList.add(new Account(2, "Shirley Moh", 84449111));
		accountList.add(new Account(3, "Jackey Tan", 83339188));
		accountList.add(new Account(4, "Zhou Ye", 92349988));
		appList.add(new Appointment(1, "Kok Peng", "Wednesday-2.45pm"));
		appList.add(new Appointment(2, "Shirley Moh", "Friday-4.45pm"));
	}

}
