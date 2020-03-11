package com.kodilla.stream;

import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> userNames = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getGroup().equals("Chemist"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        System.out.println(userNames);
    }

    public static String getUserName(Users user) {
        return user.getUsername();
    }
}
