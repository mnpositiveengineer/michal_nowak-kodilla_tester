package zadanie_2;

//import biblioteki liczb pseudolosowych
import java.util.ArrayList;
import java.util.Random;
    public class RandomNumbers {

        //stworzenie obiektu na podstawie klasy Random (z biblioteki)

        Random random = new Random();

        //stworzenie metody losującej liczby losowe. Liczby losowe są automatycznie dodawane do tablicy

        public Integer[] createRandomNumbers(int max) {
            int total = 0;
            int temp;
            ArrayList<Integer> randomNumbers = new ArrayList<>();
            while (total <= max) {
                temp = random.nextInt(31);
                total = total + temp;
                randomNumbers.add(temp);
            }
            return randomNumbers.toArray(new Integer[0]);
        }

        public int getMin(Integer[] totalResult) {
            int min = totalResult[0];
            for (int i = 1; i < totalResult.length; i++) {
                if (totalResult[i] < min) {
                    min = totalResult[i];
                }
            }
            return min;
        }

        public int getMax(Integer[] totalResult) {
            int max = totalResult[0];
            for (int i = 1; i < totalResult.length; i++) {
                if (totalResult[i] > max) {
                    max = totalResult[i];
                }
            }
            return max;
        }
    }
