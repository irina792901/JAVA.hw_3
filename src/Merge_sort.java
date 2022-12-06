import java.util.Scanner;

/**
 * Реализовать алгоритм сортировки слиянием (НЕОБЯЗАТЕЛЬНОЕ)
 */
public class Merge_sort {
    public static void main(String[] args) {
        System.out.println("Введите элементы массива через пробел: ");
        Scanner sc = new Scanner(System.in);
        String[] rawArray = sc.nextLine().strip().split(" ");
        int[] array = new int[rawArray.length];
        for (int i = 0; i < rawArray.length; i++)
            array[i] = Integer.parseInt(rawArray[i]);
        print(array, "Исходный массив: ");
        Sort(array);
        print(array, "Отсортированныый массив: ");
    }

    private static void print(int[] arr, String text) {
        System.out.println(text);
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    private static void Sort(int[] arr) {
        if (arr.length < 2)
            return;
        int middle = arr.length / 2;
        int[] head = new int[middle];
        int[] tail = new int[arr.length - middle];

        for (int i = 0; i < middle; i++) {
            head[i] = arr[i];
        }
        for (int i = middle; i < arr.length; i++) {
            tail[i - middle] = arr[i];
        }
        Sort(head);
        //print(head);
        Sort(tail);
        //print(tail);
        int i = 0;
        int headIndex = 0;
        int tailIndex = 0;
        while (headIndex < head.length && tailIndex < tail.length) {
            if (head[headIndex] < tail[tailIndex]) arr[i++] = head[headIndex++];
            else arr[i++] = tail[tailIndex++];
        }
        for (int j = headIndex; j<head.length; j++) arr[i++] = head[j];
        for (int j = tailIndex; j < tail.length; j++) arr[i++] = tail[j];
    }
}
