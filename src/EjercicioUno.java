import java.util.ArrayList;
import java.util.List;

public class EjercicioUno {

    public static void main (String[] args) {

        String fruit1 = "Apple";
        String fruit2 = "Banana";
        String fruit3 = "Cherry";

        List<String> fruits = new ArrayList<>();
        fruits.add(fruit1);
        fruits.add(fruit2);
        fruits.add(fruit3);

        System.out.println(fruits);
        System.out.println(fruits.size());

        fruits.remove(1);
        System.out.println(fruits);

        fruits.set(1,"Orange");
        System.out.println(fruits);


    }

}