public class Application {
    public static void main(String[] args) {
        Array array1 = new Array();

        int[] randomNumbersinArray = array1.randomNumbers(5000);

        for (int i=0; i < randomNumbersinArray.length; i++){
            System.out.println(randomNumbersinArray[i]);
        }
    }
}
