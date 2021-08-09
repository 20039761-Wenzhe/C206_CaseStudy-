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
		i1 = new Issue("Zhou Ye", "Cashback not given yet", "Pending");
		i2 = new Issue("Jackey", "Wrong amount charged for the car", "Solving");
		f1 = new Feedback("Jisoo", "Good customer service");
		f2 = new Feedback("Shy Chan", "Items are overpriced");
		
		issueList= new ArrayList<Issue>();
		feedbackList= new ArrayList<Feedback>();
	}
	@Test
	public void testViewIssue() {//wenzhe
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid Issue arraylist to add to", issueList);
		//Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addIssue(issueList, i1);		
		assertEquals("Test if that Issue arraylist size is 1?", 1, issueList.size());
		//The issue just added is as same as the first item of the list
		assertSame("Test that Issue is added same as 1st item of the list?", i1, issueList.get(0));
		//Add another issue to  test he size of the list is 2?
		C206_CaseStudy.addIssue(issueList, i2);
		assertEquals("Test that Issue arraylist size is 2?", 2, issueList.size());
	}
	
	@Test
	public void testViewFeedback() {//wenzhe
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid Issue arraylist to add to", feedbackList);
		//Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addFeedback(feedbackList, f1);		
			assertEquals("Test if that Feedback arraylist size is 1?", 1, feedbackList.size());
		//The issue just added is as same as the first item of the list
		assertSame("Test that Feedback is added same as 1st item of the list?", f1, feedbackList.get(0));
		//Add another issue to  test he size of the list is 2?
		C206_CaseStudy.addFeedback(feedbackList, f2);
		assertEquals("Test that Feedback arraylist size is 2?", 2, issueList.size());
	}
	@Test
	public void testAddIssue() {//wenzhe
		// Item list is not null, so that can add a new item
			assertNotNull("Test if there is valid Feedback arraylist to add to", issueList);
			//Given an empty list, after adding 1 item, the size of the list is 1
			C206_CaseStudy.addIssue(issueList, i1);		
			assertEquals("Test if that Issue arraylist size is 1?", 1, issueList.size());
		//The issue just added is as same as the first item of the list
		assertSame("Test that Issue is added same as 1st item of the list?", i1, issueList.get(0));
		//Add another issue to  test he size of the list is 2?
		C206_CaseStudy.addIssue(issueList, i2);
		assertEquals("Test that Issue arraylist size is 2?", 2, issueList.size());
	}
	@Test
	public void testAddFeedback() {//wenzhe
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid Feedback arraylist to add to", feedbackList);
		//Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addFeedback(feedbackList, f1);		
		assertEquals("Test if that Feedback arraylist size is 1?", 1, feedbackList.size());
		//The issue just added is as same as the first item of the list
		assertSame("Test that Feedback is added same as 1st item of the list?", f1, feedbackList.get(0));
		//Add another issue to  test he size of the list is 2?
		C206_CaseStudy.addFeedback(feedbackList, f2);
		assertEquals("Test that Feedback arraylist size is 2?", 2, issueList.size());
	}
	@Test
	public void testDeleteIssue() {//wenzhe
		// Item list is not null, so that can add a new item
			assertNotNull("Test if there is valid Issue arraylist to add to", issueList);
			//Add 1 issue & delete it, check that Arraylist is 0
			C206_CaseStudy.addIssue(issueList, i1);	
			C206_CaseStudy.deleteIssue(issueList, i1);
			assertEquals("Test if that Issue arraylist size is 0?", 0, issueList.size());
	}
	@Test
	public void testDeleteFeedback() {//wenzhe
		// Item list is not null, so that can add a new item
			assertNotNull("Test if there is valid Feedback arraylist to add to", feedbackList);
			//Add 1 feedback & delete it, check that Arraylist is 0
			C206_CaseStudy.addFeedback(feedbackList, f1);	
			C206_CaseStudy.deleteFeedback(feedbackList, f1);
			assertEquals("Test if that Feedback arraylist size is 0?", 0, feedbackList.size());
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
