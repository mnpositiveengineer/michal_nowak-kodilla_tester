package com.kodilla.abstracts.homework.homework2;

public class Person {
    public static void main(String[] args) {
        Baker marcel = new Baker(0, "Marcel", 35, "Baker");
        Policeman claudius = new Policeman(0, "Claudius", 45, "Policeman");
        claudius.displayIntro();
        claudius.showResponsibilites();
        marcel.displayIntro();
        marcel.showResponsibilites();
    }
}

