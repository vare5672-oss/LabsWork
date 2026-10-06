import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public int removeElementInPlace (List<Integer> arr, int val) {
        int k = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) != val) {
                arr.set(k, arr.get(i));
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Main solver = new Main();

        List<Integer> arr1 = new ArrayList<>(Arrays.asList(4, 5, 5, 4));
        int val1 = 4;

        System.out.println("Заданный список: " + arr1);
        System.out.println("Удаляемое число: " + val1);

        int newLength1 = solver.removeElementInPlace (arr1, val1);

        System.out.println("Новая длина: " + newLength1);
        System.out.print("Изменённый список: [");
        for (int i = 0; i < newLength1; i++) {
            System.out.print(arr1.get(i) + (i < newLength1 - 1 ? ", " : ""));
        }
        System.out.println("]");
        System.out.println();

        List<Integer> arr2 = new ArrayList<>(Arrays.asList(0, 2, 6, 6, 1, 0, 4, 6));
        int val2 = 6;

        System.out.println("Заданный список: " + arr2);
        System.out.println("Удаляемое число: " + val2);

        int newLength2 = solver.removeElementInPlace (arr2, val2);

        System.out.println("Новая длина: " + newLength2);
        System.out.print("Изменённый список: [");
        for (int i = 0; i < newLength2; i++) {
            System.out.print(arr2.get(i) + (i < newLength2 - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}