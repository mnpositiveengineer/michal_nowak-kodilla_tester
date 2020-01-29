package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b =8;
        int sumResult = calculator.adding(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);  //wygląda na to, że nie musieliśmy tutaj tworzyć obiektu bo metoda jest statyczna.
        if (correct){
            System.out.println("Metoda adding działa poprawnie dla liczb " + a + " i " + b);
        }else{
            System.out.println("Metoda adding nie działa poprawnie dla liczb " + a + " i " + b);
        }

        //tworzę zmienną do której zapisuje wynik z metody subtraction

        int subtractionResult = calculator.subtraction(a, b);

        //do zmiennej boolean zapisuję prawda czy fałsz dla argumentów -3 i zmiennej subtractionResult

        boolean correct2 = ResultChecker.assertEquals(-3, subtractionResult);

        //wyświetlam wyniki

        if (correct2){
            System.out.println("Metoda subtraction działa poprawnie dla liczb " + a + " i " + b);
        }else{
            System.out.println("Metoda subtraction nie działa poprawnie dla liczb " + a + " i " + b);
        }

        //do zmiennej zapisuję wynik z metody squre

        int squareResult = calculator.square(a);

        boolean correct3 = ResultChecker.assertEquals(25, squareResult);

        if (correct3){
            System.out.println("Metoda square działa poprawnie dla liczby " + a);
        }else{
            System.out.println("Metoda square nie działa poprawnie dla liczby " + a);
        }
    }
}
