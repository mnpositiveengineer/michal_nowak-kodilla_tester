package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
       List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getGroup().equals("Chemist"))
                .map(UsersManager::getUsersName)
                .collect(Collectors.toList());
        System.out.println(usernames);
    }
    public static String getUsersName (Users users){
        return users.getUserName();
    }
}
