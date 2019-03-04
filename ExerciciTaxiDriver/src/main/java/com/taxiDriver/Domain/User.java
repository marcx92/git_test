package com.taxiDriver.Domain;

import com.taxiDriver.Utilities.Encryptor;
import com.taxiDriver.Utilities.InvalidParamException;

import javax.persistence.*;

@Entity (name = "User")
public abstract class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userId")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;

    public User(){}

    public User(String name, String lastName, String email, String password) throws InvalidParamException {
        if (email == null || email.equals("") || !email.contains("@") || !email.contains(".com"))
            throw new InvalidParamException();
        if(password == null || password.equals(""))
            throw new InvalidParamException();
        if (name == null || name.equals("") || name.matches("[$&+,:;=?@#|'<>.^*()%!-]"))
            throw new InvalidParamException();
        if (lastName == null || lastName.equals("") || lastName.matches("[$&+,:;=?@#|'<>.^*()%!-]"))
            throw new InvalidParamException();

        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public void checkPasswordIsCorrect(String password) throws InvalidParamException {
        Encryptor.checkIfPasswordMatches(password, this.password);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
}
