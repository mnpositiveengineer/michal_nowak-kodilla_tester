package com.kodilla.stream;

import com.kodilla.stream.homework.Groups;
import com.kodilla.stream.homework.UserName;

import java.util.Objects;

public class Users {
    private UserName userName;
    private int age;
    private int numberOfPosts;
    private Groups group;

    public Users(UserName userName, int age, int numberOfPosts, Groups group) {
        this.userName = userName;
        this.age = age;
        this.numberOfPosts = numberOfPosts;
        this.group = group;
    }

    public UserName getUserName() {
        return userName;
    }

    public int getAge() {
        return age;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public Groups getGroup() {
        return group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return age == users.age &&
                numberOfPosts == users.numberOfPosts &&
                userName == users.userName &&
                group == users.group;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, age, numberOfPosts, group);
    }

    @Override
    public String toString() {
        return "Users{" +
                "userName=" + userName +
                ", age=" + age +
                ", numberOfPosts=" + numberOfPosts +
                ", group=" + group +
                '}';
    }
}
