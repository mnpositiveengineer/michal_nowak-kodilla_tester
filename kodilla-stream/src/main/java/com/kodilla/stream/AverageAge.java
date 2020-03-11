package com.kodilla.stream;

public class AverageAge {
    public static void main(String[] args) {
        double avg = UsersRepository.getUsersList()
                .stream()
                .map(u -> u.getAge())
                .mapToInt(u -> u)
                .average()
                .getAsDouble();
        System.out.println(avg);

    }


}
