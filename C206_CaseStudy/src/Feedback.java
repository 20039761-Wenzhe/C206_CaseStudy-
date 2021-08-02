
/**
 * I declare that this code was written by 20039761.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 20039761, 2 Aug 2021 5:27:29 pm
 */

public class Feedback {
	private int feedId;
	private String issue;
	private String status;
	
	public Feedback(int feedId, String issue, String status) {
		this.feedId = feedId;
		this.issue = issue;
		this.status = status;
	}
	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getFeedId() {
		return feedId;
	}

	public void setFeedId(int feedId) {
		this.feedId = feedId;
	}
}
