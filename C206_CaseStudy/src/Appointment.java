import java.time.LocalDate;

/**
 * I declare that this code was written by 20039761.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 20039761, 2 Aug 2021 5:27:37 pm
 */

public class Appointment {
	private String appId;
	private String apName;
	private LocalDate time;
	
	public Appointment(String appId, String apName, LocalDate time) {
		this.apName = apName;
		this.appId = appId;
		this.time = time;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public LocalDate getTime() {
		return time;
	}
	public void setTime(LocalDate time) {
		this.time = time;
	}
	public String getApName() {
		return apName;
	}
	public void setApName(String apName) {
		this.apName = apName;
	}
	

}
