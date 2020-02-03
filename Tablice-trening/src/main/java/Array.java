import java.util.Random;

public class Array {

    Random random = new Random();

    public int[] randomNumbers(int max){
        int total = 0;
        int temp;
        int size = 0;
        int[] firstArray = new int[0];
        while (total < max){
            temp = random.nextInt(31);
            total = total + temp;
            size++;
            int[] nextArray = new int[size];
            System.arraycopy(firstArray, 0, nextArray, 0, firstArray.length);
            nextArray[size-1] = temp;
            firstArray = nextArray;
        }
        return  firstArray;
    }
}
