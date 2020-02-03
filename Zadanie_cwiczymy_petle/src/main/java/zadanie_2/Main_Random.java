package zadanie_2;

public class Main_Random {
    public static void main(String[] args) {

        int max = 5000;

        RandomNumbers object = new RandomNumbers();

        Integer[] totalResult = object.createRandomNumbers(max);

        int minValue = object.getMin(totalResult);
        System.out.println(minValue);

        int maxValue=object.getMax(totalResult);
        System.out.println(maxValue);

    }
}