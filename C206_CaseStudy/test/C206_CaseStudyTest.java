import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {


	private Issue i1;
	private Issue i2;
	private Feedback f1;
	private Feedback f2;
	private Car c1;
	private Car c2;

	private ArrayList<Issue> issueList;
	private ArrayList<Feedback> feedbackList;
	private ArrayList<Car> carList;
	
	public C206_CaseStudyTest() {
		super();	
		}

	@Before
	public void setUp() throws Exception {
		i1 = new Issue(1, "Zhou Ye", "Cashback not given yet", "Pending");
		i2 = new Issue(2, "Jackey", "Wrong amount charged for the car", "Solved");
		f1 = new Feedback(1, "Jisoo", "Good customer service", "");
		f2 = new Feedback(2, "Shy Chan", "Items are overpriced", "");
		c1= new Car(1,"Traxxas Rustler", "Blue", 79);
		c2 = new Car(2,"Arrma Typhon", "Red", 68);
		
		issueList= new ArrayList<Issue>();
		feedbackList= new ArrayList<Feedback>();
		carList = new ArrayList<Car>();

	}
	
	///////////////////////////////////////////////JASMINE/////////////////////////////////////////////////////////////
	@Test
	public void testAddCar() {
		// Car list is not null, so that can add a new Issue
		assertNotNull("Test if there is valid Car arraylist to add to", carList);
		
		//Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.carAdded(carList, c1);		
		assertEquals("Test if that Car arraylist size is 1?", 1, carList.size());
		
		//The item just added is as same as the first item of the list
		assertSame("Test that Car added is same as 1st item of the list?", c1, carList.get(0));
		
		//Add another item. test The size of the list is 2?
		C206_CaseStudy.carAdded(carList, c2);
		assertEquals("Test that Car arraylist size is 2?", 2, carList.size());
	}
	
	@Test
	public void testRetrieveAllCar() {
		// Test if Car list is not null but empty, so that can add a new Car
		assertNotNull("Test if there is valid Car arraylist to retrieve from", carList);
		
		//test if the list of Car retrieved from the CaseStudy is empty
				String allCar= C206_CaseStudy.retrieveAllCar(carList);
				String testOutput = "";
				assertEquals("Check that ViewCar is empty", testOutput, allCar);
				
		//Given an empty list, after adding 2 cars, test if the size of the list is 2
		C206_CaseStudy.carAdded(carList, c1);
		C206_CaseStudy.carAdded(carList, c2);
		assertEquals("Test if that Car arraylist size is 2?", 2, carList.size());
		
		//test if the expected output string same as the list of issues retrieved from the arraylist
		allCar= C206_CaseStudy.retrieveAllCar(carList);

		testOutput = String.format("%-5d %-20s %-15s %-10s\n", 1,"Traxxas Rustler", "Blue", 79);
		testOutput += String.format("%-5d %-20s %-15s %-10s\n", 2,"Arrma Typhon", "Red", 68);
	
		assertEquals("Check that ViewCar has the same output as retrieved from the arraylist", testOutput, allCar);
		
	}
	@Test
	public void testDeleteCar() {
		// Test if Car list is not null but empty, so that can add a new Issue
		assertNotNull("Test if there is valid Car arraylist to retrieve from", carList);
	}
	///////////////////////////////////////////////WENZHE/////////////////////////////////////////////////////////////
	@Test
	public void testAddIssue() {
		// Issue list is not null, so that can add a new Issue
		assertNotNull("Test if there is valid Issue arraylist to add to", issueList);
		
		//Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addIssue(issueList, i1);		
		assertEquals("Test if that Issue arraylist size is 1?", 1, issueList.size());
		
		//The item just added is as same as the first item of the list
		assertSame("Test that Issue added is same as 1st item of the list?", i1, issueList.get(0));
		
		//Add another item. test The size of the list is 2?
		C206_CaseStudy.addIssue(issueList, i2);
		assertEquals("Test that Issue arraylist size is 2?", 2, issueList.size());
	}
	@Test
	public void testAddFeedback() {
		// Issue list is not null, so that can add a new Issue
		assertNotNull("Test if there is valid Feedback arraylist to add to", feedbackList);
		
		//Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addFeedback(feedbackList, f1);		
		assertEquals("Test if that Feedback arraylist size is 1?", 1, feedbackList.size());
		
		//The item just added is as same as the first item of the list
		assertSame("Test that Feedback added is same as 1st item of the list?", f1, feedbackList.get(0));
		
		//Add another item. test The size of the list is 2?
		C206_CaseStudy.addFeedback(feedbackList, f2);
		assertEquals("Test that Feedback arraylist size is 2?", 2, feedbackList.size());
	}
	@Test
	public void testRetrieveAllIssue() {
		// Test if Issue list is not null but empty, so that can add a new Issue
		assertNotNull("Test if there is valid Issue arraylist to retrieve from", issueList);
		
		//test if the list of Issue retrieved from the CaseStudy is empty
				String allIssue= C206_CaseStudy.retrieveAllIssue(issueList);
				String testOutput = "";
				assertEquals("Check that ViewAllIssueList is empty", testOutput, allIssue);
				
		//Given an empty list, after adding 2 issues, test if the size of the list is 2
		C206_CaseStudy.addIssue(issueList, i1);
		C206_CaseStudy.addIssue(issueList, i2);
		assertEquals("Test if that Issue arraylist size is 2?", 2, issueList.size());
		
		//test if the expected output string same as the list of issues retrieved from the arraylist
		allIssue= C206_CaseStudy.retrieveAllIssue(issueList);

		testOutput = String.format("%-5d %-15s %-35s %-10s\n", 1, "Zhou Ye", "Cashback not given yet", "Pending");
		testOutput += String.format("%-5d %-15s %-35s %-10s\n", 2, "Jackey", "Wrong amount charged for the car", "Solved");
	
		assertEquals("Check that ViewALlIssue has the same output as retrieved from the arraylist", testOutput, allIssue);
		
	}
	@Test
	public void testRetrieveAllFeedback() {
		// Test if Feedback list is not null but empty, so that can add a new Feedback
		assertNotNull("Test if there is valid Feedback arraylist to retrieve from", feedbackList);
		
		//test if the list of Feedback retrieved from the CaseStudy is empty
				String allFeedback= C206_CaseStudy.retrieveAllFeedback(feedbackList);
				String testOutput = "";
				assertEquals("Check that ViewAllFeedbackList is empty", testOutput, allFeedback);
				
		//Given an empty list, after adding 2 feedbacks, test if the size of the list is 2
		C206_CaseStudy.addFeedback(feedbackList, f1);
		C206_CaseStudy.addFeedback(feedbackList, f2);
		assertEquals("Test if that Feedback arraylist size is 2?", 2, feedbackList.size());
		
		//test if the expected output string same as the list of feedbacks retrieved from the arraylist
		allFeedback= C206_CaseStudy.retrieveAllFeedback(feedbackList);

		testOutput = String.format("%-10s %-10s %-25s %-30s\n", 1, "Jisoo", "Good customer service", "");
		testOutput += String.format("%-10s %-10s %-25s %-30s\n", 2, "Shy Chan", "Items are overpriced", "");
	
		assertEquals("Check that ViewAllFeedbackList has the same output as retrieved from the arraylist", testOutput, allFeedback);
		
	}
	@Test
	public void testDeleteIssue() {
		//Test that the arraylist is not null
		assertNotNull("Test if there is a valid issue arrayList", issueList);

		// After adding 1 item and deleting it, test if the size of the list is 0
		C206_CaseStudy.addIssue(issueList, i1);
		C206_CaseStudy.deleteIssue(issueList, i1.getId());
		assertEquals("Test that issue arraylist size is 0", 0, issueList.size());
		
		// After adding 2 item and deleting the first one, test if the size of the list is 1
		C206_CaseStudy.addIssue(issueList, i1);
		C206_CaseStudy.addIssue(issueList, i2);
		C206_CaseStudy.deleteIssue(issueList, i1.getId());
		assertEquals("Test that issue arraylist size is 1", 1, issueList.size());
		
		//After deleting the last issue, check that the size of the list is 0
		C206_CaseStudy.deleteIssue(issueList, i2.getId());
		assertEquals("Test that issue arraylist size is 0", 0, issueList.size());
		
}
	@Test
	public void testDeleteFeedback() {
		//Test that the arraylist is not null
		assertNotNull("Check if there is a valid feedback arrayList", feedbackList);

		// After adding 1 item and deleting it, test if the size of the list is 0
		C206_CaseStudy.addFeedback(feedbackList, f1);
		C206_CaseStudy.deleteFeedback(feedbackList, f1.getId());
		assertEquals("Test that feedback arraylist size is 0", 0, feedbackList.size());
		
		// After adding 2 item and deleting the first one, test if the size of the list is 1
		C206_CaseStudy.addFeedback(feedbackList, f1);
		C206_CaseStudy.addFeedback(feedbackList, f2);
		C206_CaseStudy.deleteFeedback(feedbackList, f1.getId());
		assertEquals("Test that feedback arraylist size is 1", 1, feedbackList.size());
		
		//After deleting the last feedback, check that the size of the list is 0
		C206_CaseStudy.deleteFeedback(feedbackList, f2.getId());
		assertEquals("Test that feedback arraylist size is 0", 0, feedbackList.size());
		
}
	public void testReplyFeedback() {
		//Test that the arraylist is not null
		assertNotNull("Check if there is a valid feedback arrayList", feedbackList);
		
		//Add 1 feedback and reply to the feedback, check if the expected output string same as feedback added after replying
		C206_CaseStudy.addFeedback(feedbackList, f1);
		C206_CaseStudy.replyFeedback(feedbackList);
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@After
	public void tearDown() throws Exception {
		i1 = null;
		i2 = null;
		f1 = null;
		f2 = null;
		c1 = null;
		c2 = null;
		carList = null;
		issueList = null;
		feedbackList = null;
	}

}