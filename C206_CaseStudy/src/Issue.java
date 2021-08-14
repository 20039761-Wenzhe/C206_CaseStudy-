
/**
 * I declare that this code was written by 20039761. I will not copy or allow
 * others to copy my code. I understand that copying code is considered as
 * plagiarism.
 *
 * 20039761, 3 Aug 2021 10:16:28 am
 */

public class Issue {
    private int id;
    private String name;
    private String issue;
    private String status;
    
    public Issue(int id, String name, String issue, String status) {
        this.id = id;
        this.name = name;
        this.issue = issue;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}