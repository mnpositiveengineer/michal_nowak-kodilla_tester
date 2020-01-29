public class Main {
    public static void main(String[] args){

        //stworzone obiekty na podstawie konstruktora

        Users user1 = new Users ("Michał", 27);
        Users user2 = new Users ("Filip", 13);
        Users user3 = new Users ("Kuba", 18);
        Users user4 = new Users ("Marek", 55);
        Users user5 = new Users ("Kasia", 26);
        Users user6 = new Users ("Asia", 21);
        Users user7 = new Users ("Ola", 14);
        Users user8 = new Users ("Sonia", 13);
        Users user9 = new Users ("Krzychu",36);
        Users user10 = new Users ("Ania",56);
        Users user11 = new Users ("Basia",70);
        Users user12 = new Users ("Cecylia",12);

        //stworzenie tablic, których wartościami są poszczególne zmienne w obiektach

        Users[] users = new Users[] {user1, user2, user3, user4, user5, user6, user7, user8, user9, user10, user11, user12};

        countAges object = new countAges();

        //zapis do zmiennych dwóch ważnych wartości zwróconych z metod z klasy countAges -
        //wartości mogliśmy zwrócić tylko dzięki temu, że utworzyliśmy obiekt
        //tej klasy

        int returnedTotalAge = object.countTotalAge(users);
        double returnAverage = object.countAverage(users);

        //wywołanie metody pokazującej finalną wartość

        object.showWhoIsUnderAverage(users);
    }
}
