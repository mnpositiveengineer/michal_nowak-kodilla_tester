package com.kodilla.optional;

import com.kodilla.stream.Users;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        Users users = new Users("user1", 0, 0, "Test");

        Optional<Users> optionalUsers = Optional.ofNullable(users);

        String username =
                optionalUsers.orElse(new Users("", 0, 0, "")).getUserName();

        System.out.println(username);

        optionalUsers.ifPresent(u -> System.out.println(u.getUserName()));
    }
}
