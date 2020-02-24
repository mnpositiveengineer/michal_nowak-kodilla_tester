package com.kodilla.stream;

import java.util.ArrayList;
import java.util.List;

public class UsersRepository {
    public static List<Users> getUsersList() {
        List<Users> users = new ArrayList<>();
        users.add(new Users("Walter White", 50, 7, "Chemist"));
        users.add(new Users("Jessie Pinkman", 25, 4648, "Sales"));
        users.add(new Users("Tuco Salamanca", 34, 116, "Manager"));
        users.add(new Users("Gus Fring", 49, 0, "Board"));
        users.add(new Users("Gale Boetticher", 44, 2, "Chemist"));
        users.add(new Users("Mike Ehrmantraut", 57, 0, "Security"));
        return users;
    }
}
