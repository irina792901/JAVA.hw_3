import java.util.ArrayList;
import java.util.Random;

/**
 * Задан целочисленный список ArrayList.
 * Найти минимальное, максимальное и среднее из этого списка.
 */
public class Min_max_average {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arr.add(rnd.nextInt(-10, 10));
        }
        System.out.println(arr);
        int min = arr.get(0), max = min;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < min) min = arr.get(i);
            if (arr.get(i) > max) max = arr.get(i);
        }
        double moda = (min + max) / 2.0;
        double deviation = Math.abs(moda - arr.get(0));
        int middle = arr.get(0);
        for (int item : arr) {
            if (Math.abs(moda - item) < deviation) {
                deviation = Math.abs(moda - item);
                middle = item;
            }
        }
        System.out.printf("Минимальное: %d; максимальное: %d; среднее: %d", min, max, middle);
    }
}