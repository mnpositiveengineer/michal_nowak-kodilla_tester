package com.kodilla.stream;

import com.kodilla.stream.homework.Groups;
import com.kodilla.stream.homework.UserName;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UsersRepository {
    public static List<Users> getUsersList() {
        List<Users> users = new ArrayList<>();

        for (int i = 0; i < generateRandomNumbersOfUsersToAdd(); i++ ){
            Random random = new Random();
            users.add(new Users(generateRandomUsername(), random.nextInt(100) +1, random.nextInt(1000)+1, generateRandomGroup()));
        }
        return users;
    }

    private static int generateRandomNumbersOfUsersToAdd(){
        Random random = new Random();
        return random.nextInt(20) + 1;
    }

    private static UserName generateRandomUsername(){

        Random random = new Random();
        int result = random.nextInt(11)+1;

        if (result == 1){
            return UserName.JACOB;
        } else if (result == 2) {
            return UserName.CHANDLER;
        } else if (result == 3) {
            return UserName.JOANA;
        } else if (result == 4) {
            return UserName.JOYE;
        } else if (result == 5) {
            return UserName.KATE;
        } else if (result == 6) {
            return UserName.KRIS;
        } else if (result == 7) {
            return UserName.MICHAEL;
        } else if (result == 8) {
            return UserName.MONICA;
        } else if (result == 9) {
            return UserName.RACHEL;
        } else if (result == 10) {
            return UserName.SONIA;
        }else {
            return UserName.PHEEBE;
        }
    }

    private static Groups generateRandomGroup() {

        Random random = new Random();
        int result = random.nextInt(11)+1;

        if (result == 1) {
            return Groups.ACTOR;
        } else if (result == 2) {
            return Groups.BAKER;
        } else if (result == 3) {
            return Groups.DOCTOR;
        } else if (result == 4) {
            return Groups.FIREMAN;
        } else if (result == 5) {
            return Groups.HUMAN_SOLUTION_DESIGNER;
        } else if (result == 6) {
            return Groups.JUNIOR_OFFICE_ADMINISTRATOR;
        } else if (result == 7) {
            return Groups.POLICEMAN;
        } else if (result == 8) {
            return Groups.PRESIDENT;
        } else if (result == 9) {
            return Groups.PRINCIPAL_MOBILITY_EXECUTIVE;
        } else if (result == 10) {
            return Groups.SANTA_CLAUS;
        } else {
            return Groups.TV_PRESENTER;
        }
    }
}
