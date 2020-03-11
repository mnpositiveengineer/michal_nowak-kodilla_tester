package com.kodilla.stream;

import java.util.Objects;

public class Users {
    private String username;
    private int age;
    private int numberOfPosts;
    private String group;

    public Users(String username, int age, int numberOfPosts, String group) {
        this.username = username;
        this.age = age;
        this.numberOfPosts = numberOfPosts;
        this.group = group;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return age == users.age &&
                numberOfPosts == users.numberOfPosts &&
                Objects.equals(username, users.username) &&
                Objects.equals(group, users.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, age, numberOfPosts, group);
    }
}
