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
	
	private ArrayList<Issue> issueList;
	private ArrayList<Feedback> feedbackList;
	
	public C206_CaseStudyTest() {
		super();	
		}

	@Before
	public void setUp() throws Exception {
		i1 = new Issue(1, "Zhou Ye", "Cashback not given yet", "Pending");
		i2 = new Issue(2, "Jackey", "Wrong amount charged for the car", "Solved");
		f1 = new Feedback(1, "Jisoo", "Good customer service", "");
		f2 = new Feedback(2, "Shy Chan", "Items are overpriced", "");
		
		issueList= new ArrayList<Issue>();
		feedbackList= new ArrayList<Feedback>();
	}
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

		testOutput = String.format("%-10s %-10s %-15s %-20s\n", 1, "Jisoo", "Good customer service", "");
		testOutput += String.format("%-10s %-10s %-15s %-20s\n", 2, "Shy Chan", "Items are overpriced", "");
	
		assertEquals("Check that ViewAllFeedbackList has the same output as retrieved from the arraylist", testOutput, allFeedback);
		
	}
	public void testDeleteIssue() {
		// Test if Issue list is not null but empty, so that can add a new Issue
		assertNotNull("Test if there is valid Issue arraylist to retrieve from", issueList);
		
	
	}

	
	@After
	public void tearDown() throws Exception {
		i1 = null;
		i2 = null;
		f1 = null;
		f2 = null;
		issueList = null;
		feedbackList = null;
	}

}