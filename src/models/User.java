package models;

import enums.Gender;

import java.util.ArrayList;
import java.util.List;

public class User {
private Long uniqueId;
private String email;
private String password;
private String fullName;
private Gender gender;

    public User(Long uniqueId, String email, String password, String fullName, Gender gender) {
        this.uniqueId = uniqueId;
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.gender = gender;
    }

    public User(String email, String password) {
    }

    List<Post> posts=new ArrayList<>();
    public Long getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(Long uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    @Override
    public String toString() {
        return "User{" +
                "uniqueId=" + uniqueId +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", gender=" + gender +
                '}';
    }
}
