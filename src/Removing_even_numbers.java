import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Пусть дан произвольный список целых чисел, удалить из него четные числа
 */
public class Removing_even_numbers {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arr.add(rnd.nextInt(20));
        }
        System.out.println(arr);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0) arr.remove(i--);
        }
        System.out.println(arr);
    }
}
