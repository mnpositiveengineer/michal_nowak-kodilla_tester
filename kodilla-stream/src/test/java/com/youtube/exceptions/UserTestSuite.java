package com.youtube.exceptions;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class UserTestSuite {

    User user = new User();

    @Test (expected = IllegalArgumentException.class)
    public void ShouldReturnExceptionWhenUsernameIsNull() throws IllegalArgumentException {
        user.setName(null);
    }

    @Test (expected = IllegalArgumentException.class)
    public void ShouldReturnExceptionWhenUsernameIsToShort() throws IllegalArgumentException {
        user.setName("ab");
    }

    @Test (expected = IllegalArgumentException.class)
    public void ShouldReturnExceptionWhenUsernameIsToLong() throws IllegalArgumentException {
        user.setName("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void ShouldReturnMessageWhenUsernameIsNull() throws IllegalArgumentException {
        thrown.expectMessage("Username cannot be blank.");
        user.setName(null);
    }

    @Test
    public void ShouldReturnMessageWhenUsernameIsToShort() throws IllegalArgumentException {
        thrown.expectMessage("Username is to short.");
        user.setName("ab");
    }

    @Test
    public void ShouldReturnMessageWhenUsernameIsToLong() throws IllegalArgumentException {
        thrown.expectMessage("Username is too long.");
        user.setName("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void ShouldAssertTheSameMessageWhenUserNameIsNull() throws IllegalArgumentException {
        try {
            user.setName(null);
        } catch (IllegalArgumentException e) {
            assertEquals("Userame cannot be blank.", e.getMessage());
        }
    }
}