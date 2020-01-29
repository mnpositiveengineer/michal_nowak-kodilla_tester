//import biblioteki liczb pseudolosowych
import java.util.Random;
    public class RandomNumbers {

        //stworzenie obiektu na podstawie klasy Random (z biblioteki)

        Random random = new Random();

        //stworzenie metody losującej liczby losowe. Liczby losowe są automatycznie dodawane do tablicy

        public int[] createRandomNumbers(int max) {
        int total = 0;
        int value = 0;
        int[] table = new int[1000];
        while (total <= max) {
            table[value] = random.nextInt(31);
            total = total + table[value];
            value++;
        }
        return table;
    }

        // stworzenie metody liczącej minimalną wartość z tablicy

        public int getMin(int[] totalResult){
            int min = totalResult[0];
            for(int i = 1; i < totalResult.length; i++){
                if(totalResult[i] < min){
                    min = totalResult[i];
                }
            }
            return min;
        }

        //stworzenie metody liczącej maksymalną wartosć z tablicy

        public int getMax(int[] totalResult){
            int max = totalResult[0];
            for(int i = 1; i < totalResult.length; i++){
                if(totalResult[i] > max){
                    max = totalResult[i];
                }
            }
            return max;
        }
}