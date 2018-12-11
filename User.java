package bprat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    private String lastName;
    private String firstName;
    @JsonIgnore
    private String sid;

    @JsonIgnore
    private String joiningDate;
    @JsonIgnore
    private String designation;
    @JsonIgnore
    private String location;

    public User() {
    }

    public User(String firstName, String lastName, String sid, String joiningDate, String location, String designation) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.sid = sid;
        this.joiningDate = joiningDate;
        this.designation = designation;
        this.location = location;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", sid='" + sid + '\'' +
                ", joiningDate='" + joiningDate + '\'' +
                ", designation='" + designation + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
