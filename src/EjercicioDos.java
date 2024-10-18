import java.util.ArrayList;

public class EjercicioDos {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }


        System.out.println("Usa un bucle for para imprimir cada número :) :");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }


        System.out.println("Usa un bucle for-each para imprimir los mismos números:");
        for (int number : numbers) {
            System.out.println(number);
        }


        System.out.println("Usa un bucle while para imprimir los números en orden inverso:");
        int index = numbers.size() - 1;
        while (index >= 0) {
            System.out.println(numbers.get(index));
            index--;
        }
    }
}
