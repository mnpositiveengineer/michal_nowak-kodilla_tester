package com.kodilla.optional;

import com.kodilla.stream.Users;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Users user = null;

        Optional<Users> optionalUsers = Optional.ofNullable(user);

        String username = optionalUsers.orElse(new Users("No user", 0, 0, "")).getUsername();

        System.out.println(username);

    }
}
