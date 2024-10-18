import java.util.ArrayList;

public class EjercicioCinco {
    public static void main(String[] args) {

         ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }


        Integer[] numbersArray = new Integer[numbers.size()];
        numbersArray = numbers.toArray(numbersArray);

        
        System.out.println("Contenido del array:");
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.println(numbersArray[i]);
        }
    }
}
