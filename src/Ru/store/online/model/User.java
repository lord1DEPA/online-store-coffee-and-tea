package Ru.store.online.model;

import Ru.store.online.model.enumeration.Role;

public class User {

    private String name;
    private  String lastname;
    private String mail;
    private String phoneNumber;
    private String login;
    private String password;
    private Role role;


    public String name() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String lastname() {
        return lastname;
    }

    public User setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public String mail() {
        return mail;
    }

    public User setMail(String mail) {
        this.mail = mail;
        return this;
    }

    public String phoneNumber() {
        return phoneNumber;
    }

    public User setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String login() {
        return login;
    }

    public User setLogin(String login) {
        this.login = login;
        return this;
    }

    public String password() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public Role role() {
        return role;
    }

    public User setRole(Role role) {
        this.role = role;
        return this;
    }
}
