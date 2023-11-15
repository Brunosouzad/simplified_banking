package com.banking.admin.domain.user;

import com.banking.admin.domain.AggregateRoot;

import java.time.Instant;

public class User extends AggregateRoot<UserID> {

    private String fistName;
    private String lastName;
    private String document;
    private String email;
    private String password;
    private double balance;
    private UserType userType;
    private boolean active;
    private Instant createdAt;
    private Instant upadateAt;
    private Instant deleteAt;

    public User(
            final UserID anid,
            final String aFistName,
            final String aLastName,
            final String aDocument,
            final String aEmail,
            final String aPassword,
            final double aBalance,
            final UserType aUserType,
            final boolean aActive,
            final Instant aCreatedAt,
            final Instant aUpadateAt,
            final Instant aDeleteAt) {
        super(anid);
        this.fistName = aFistName;
        this.lastName = aLastName;
        this.document = aDocument;
        this.email = aEmail;
        this.password = aPassword;
        this.balance = aBalance;
        this.userType = aUserType;
        this.active = aActive;
        this.createdAt = aCreatedAt;
        this.upadateAt = aUpadateAt;
        this.deleteAt = aDeleteAt;
    }

    public static User newUser(
            final String aFistName,
            final String aLastName,
            final String aDocument,
            final String aEmail,
            final String aPassword,
            final double aBalance,
            final UserType aUserType,
            final boolean aActive
    ) {
        final var id = UserID.unique();
        final var now = Instant.now();
        return new User(id, aFistName, aLastName, aDocument, aEmail, aPassword, aBalance, aUserType, aActive, now, now, null);
    }

    public UserID getId() {
        return id;
    }

    public String getFistName() {
        return fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDocument() {
        return document;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

    public UserType getUserType() {
        return userType;
    }

    public boolean isActive() {
        return active;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpadateAt() {
        return upadateAt;
    }

    public Instant getDeleteAt() {
        return deleteAt;
    }

}