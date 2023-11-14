package com.banking.admin.domain.user;

import java.time.Instant;
import java.util.UUID;

public class User {

    private String id;
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
            final String id,
            final String fistName,
            final String lastName,
            final String document,
            final String email,
            final String password,
            final double balance,
            final UserType userType,
            final boolean active,
            final Instant createdAt,
            final Instant upadateAt,
            final Instant deleteAt) {
        this.id = id;
        this.fistName = fistName;
        this.lastName = lastName;
        this.document = document;
        this.email = email;
        this.password = password;
        this.balance = balance;
        this.userType = userType;
        this.active = active;
        this.createdAt = createdAt;
        this.upadateAt = upadateAt;
        this.deleteAt = deleteAt;
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
        final var id = UUID.randomUUID().toString();
        final var now = Instant.now();
        return new User(id, aFistName, aLastName, aDocument, aEmail, aPassword, aBalance, aUserType, aActive, now, now, null);
    }

    public String getId() {
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