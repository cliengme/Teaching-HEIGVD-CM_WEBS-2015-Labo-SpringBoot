package ch.heigvd.ptl.sc.to;

public class IssueTypeTO {

    private String id;
    private String shortname;
    private String description;

    public String getId() {
        return id;
    }

    public String getShortname() {
        return shortname;
    }

    public String getDescription() {
        return description;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(String id) {
        this.id = id;
    }
}
