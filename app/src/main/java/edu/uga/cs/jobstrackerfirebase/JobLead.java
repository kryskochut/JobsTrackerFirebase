package edu.uga.cs.jobstrackerfirebase;


/**
 * This class represents a single job lead, including the company name,
 * phone number, URL, and some comments.
 */
public class JobLead {
    private String companyName;
    private String phone;
    private String url;
    private String comments;

    public JobLead()
    {
        this.companyName = null;
        this.phone = null;
        this.url = null;
        this.comments = null;
    }

    public JobLead( String companyName, String phone, String url, String comments ) {
        this.companyName = companyName;
        this.phone = phone;
        this.url = url;
        this.comments = comments;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String toString() {
        return companyName + " " + phone + " " + url + " " + comments;
    }
}
