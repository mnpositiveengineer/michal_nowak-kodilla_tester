package com.kodilla.stream;

import com.kodilla.stream.homework.UserName;

import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<UserName> userNames = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getGroup().equals("Chemist"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        System.out.println(userNames);
    }

    public static UserName getUserName(Users user) {
        return user.getUserName();
    }
}
