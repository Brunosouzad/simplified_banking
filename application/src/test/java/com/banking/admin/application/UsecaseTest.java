package com.banking.admin.application;

import com.banking.admin.domain.user.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UsecaseTest {

    @Test
    public void testCreateUseCase(){
        Assertions.assertNotNull(new User());
        Assertions.assertNotNull(new UseCase().execute());
    }
}
