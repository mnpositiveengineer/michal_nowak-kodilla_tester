public class Main_Random {
    public static void main(String[] args) {

        // określam zmienną max, która jest argumentem metody createRandomNumbers

        int max = 5000;

        // tworzę obiekt na podstawie klasy RandomsNumbers

        RandomNumbers object = new RandomNumbers();

        // tworzę zmienną do której chce zwrócić wynik metody createRandomNumbers

        int[] totalResult = object.createRandomNumbers(max);

        // tworzę zmienną do której zwracam wynik metody getMin + wyświetlanie

        int minValue = object.getMin(totalResult);
        System.out.println(minValue);

        // tworzę zmienną do której zwracam wynik metody getMax + wyświetlanie

        int maxValue=object.getMax(totalResult);
        System.out.println(maxValue);

    }
}