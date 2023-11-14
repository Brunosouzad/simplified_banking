package com.banking.admin.application;

import com.banking.admin.domain.user.User;

public class UseCase {

    public User execute(){
        return new User();
    }
}