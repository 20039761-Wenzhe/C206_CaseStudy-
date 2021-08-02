
/**
 * I declare that this code was written by 20039761.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 20039761, 2 Aug 2021 5:27:29 pm
 */

public class Feedback {
	private String sat;
	private String issue;
	private String status;
	
	public Feedback(String sat, String issue, String status) {
		this.sat = sat;
		this.issue = issue;
		this.status = status;
	}

	public String getSat() {
		return sat;
	}

	public void setSat(String sat) {
		this.sat = sat;
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
	
}
