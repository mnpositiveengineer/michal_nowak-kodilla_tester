package com.kodilla.stream;

import java.util.Objects;

public class Users {
    private String userName;
    private int age;
    private int numberOfPosts;
    private String group;

    public Users(String userName, int age, int numberOfPosts, String group) {
        this.userName = userName;
        this.age = age;
        this.numberOfPosts = numberOfPosts;
        this.group = group;
    }

    public String getUserName() {
        return userName;
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
                Objects.equals(userName, users.userName) &&
                Objects.equals(group, users.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, age, numberOfPosts, group);
    }

    @Override
    public String toString() {
        return "Users{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", numberOfPosts=" + numberOfPosts +
                ", group='" + group + '\'' +
                '}';
    }
}
