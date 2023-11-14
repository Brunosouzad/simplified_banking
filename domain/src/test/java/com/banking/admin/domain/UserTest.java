package com.banking.admin.domain;

import com.banking.admin.domain.user.User;
import com.banking.admin.domain.user.UserType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class UserTest {
    @Test
    public void givenAValidParams_whemCallNewCategory_thenInstantiateAUser(){
        final var expectedFistName = "Bruno";
        final var expectedLastName = "Bruno";
        final var expectedDocument = "111.555.2222-00";
        final var expectedEmail = "test@gmail.com";
        final var expectedPassword = "1234";
        final var expectedBalance = 0.200;
        final var expectedUserType = UserType.COMMOM;
        final var expectedIsActive = true;

        final var actualUser =
        User.newUser(expectedFistName,
                expectedLastName,
                expectedDocument,
                expectedEmail,
                expectedPassword,
                expectedBalance,
                expectedUserType,
                expectedIsActive);

        Assertions.assertNotNull(actualUser);
        Assertions.assertNotNull(actualUser.getId());
        Assertions.assertEquals(expectedFistName, actualUser.getFistName());
        Assertions.assertEquals(expectedLastName, actualUser.getLastName());
        Assertions.assertEquals(expectedDocument, actualUser.getDocument());
        Assertions.assertEquals(expectedEmail, actualUser.getEmail());
        Assertions.assertEquals(expectedPassword, actualUser.getPassword());
        Assertions.assertEquals(expectedBalance, actualUser.getBalance());
        Assertions.assertEquals(expectedUserType, actualUser.getUserType());
        Assertions.assertEquals(expectedIsActive, actualUser.isActive());
        Assertions.assertNotNull(actualUser.getCreatedAt());
        Assertions.assertNotNull(actualUser.getUpadateAt());
        Assertions.assertNull(actualUser.getDeleteAt());
    }
}
