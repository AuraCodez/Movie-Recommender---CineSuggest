package com.example.movieservicing.movierecs.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.util.Date;

@Document(collection = "users")
public class User {
    @Id
    private String id;
    @Field("user_name")
    private String userName;
    @Field("first_name")
    private String firstName;
    @Field("last_name")
    private String lastName;
    @Field("created")
    private Date dateRegistered;
    private String email;
    // Hash and salt password field using spring security
    private byte[] password;

    public User(String id, String userName, String firstName, String email) {
        this.id = id;
        this.userName = userName;
        this.firstName = firstName;
        this.email = email;
    }

    public User() {
        this.dateRegistered = new Date();
    }

    public String getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setPassword(byte[] password) {
        this.password = password;
    }

    public Date getUserCreationDate() {
        return dateRegistered == null ? null : new Date(dateRegistered.getTime());
    }

}
