public class countAges {
    int totalAge = 0;
    double average;

    //metoda zliczająca sumę wszystkich wieków

    public int countTotalAge(Users[] users){
        for (int i = 0; i < users.length; i++){
            totalAge = totalAge + users[i].age;
        }
        return totalAge;
    }

    //metoda zwracająca średnią wszystkich wieków

    public double countAverage(Users[] users){
        average = totalAge/users.length;
        return average;
    }

    //metoda pokazująca osoby, które są młodsze niż średnia wieku.

    public void showWhoIsUnderAverage(Users[] users){
        for(int i = 0; i < users.length; i++){
            if(users[i].age < average){
                System.out.println(users[i].name + "'s age is below the average");
            }
        }

    }
}
