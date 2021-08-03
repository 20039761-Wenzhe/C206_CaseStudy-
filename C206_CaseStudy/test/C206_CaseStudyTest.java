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

	@Before
	public void setUp() throws Exception {
		i1 = new Issue("Zhou Ye", "Cashback not given yet", "Pending");
		i2 = new Issue("Jackey", "Wrong amount charged for the car", "Solving");
		f1 = new Feedback("Jisoo", "Good customer service");
		f2 = new Feedback("Shy Chan", "Items are overpriced");
		
		issueList = new ArrayList<Issue>();
		feedbackList = new ArrayList<Feedback>();
	}



	@Test
	public void testViewIssue() {//wenzhe
		// Item list is not null, so that can add a new item
			assertNotNull("Test if there is valid Issue arraylist to add to", issueList);
	}
	@Test
	private void testViewFeedback() {//wenzhe
		// Item list is not null, so that can add a new item
			assertNotNull("Test if there is valid Issue arraylist to add to", feedbackList);
	}
	@Test
	private void testAddIssue() {//wenzhe
		// Item list is not null, so that can add a new item
			assertNotNull("Test if there is valid Feedback arraylist to add to", issueList);
	}
	@Test
	private void testAddFeedback() {//wenzhe
		// Item list is not null, so that can add a new item
			assertNotNull("Test if there is valid Feedback arraylist to add to", feedbackList);
	}
	@Test
	private void testDeleteIssue() {//wenzhe
		// Item list is not null, so that can add a new item
			assertNotNull("Test if there is valid Issue arraylist to add to", issueList);
	}
	@Test
	private void testDeleteFeedback() {//wenzhe
		// Item list is not null, so that can add a new item
			assertNotNull("Test if there is valid Feedback arraylist to add to", feedbackList);
	}
	@After
	public void tearDown() throws Exception {
	}

}
