package ch.heigvd.ptl.sc.model;

import java.util.Date;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Issue {
	@Id
	private String id;
	
        @DBRef
	private User author;
        
        @DBRef
        private IssueType issueType;
        
        private String description;
        private String latitude;
        private String longitude;
        private String status;
        
        @DBRef
        private User staffmember;
        private Date creatingDate;
        private Date closingDate;

	protected List<String> roles;

	public String getId() {
		return id;
	}
        
        public User getAuthor() {
        return author;
        }

        public IssueType getIssueType() {
            return issueType;
        }

        public String getDescription() {
            return description;
        }

        public String getLatitude() {
            return latitude;
        }

        public String getLongitude() {
            return longitude;
        }

        public String getStatus() {
            return status;
        }

        public User getStaffmember() {
            return staffmember;
        }

        public Date getCreatingDate() {
            return creatingDate;
        }

        public Date getClosingDate() {
            return closingDate;
        }

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

        public void setAuthor(User author) {
            this.author = author;
        }

        public void setIssueType(IssueType issueType) {
            this.issueType = issueType;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public void setStaffmember(User staffmember) {
            this.staffmember = staffmember;
        }

        public void setCreatingDate(Date creatingDate) {
            this.creatingDate = creatingDate;
        }

        public void setClosingDate(Date closingDate) {
            this.closingDate = closingDate;
        }
	
	public boolean hasRole(String role) {
		for (String userRole : roles) {
			if (userRole.equals(role)) {
				return true;
			}
		}
		return false;
	}
}
