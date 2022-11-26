import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Do you want shift the array to left size?");
        boolean left = false;
        System.out.println("how many steps?");
        int step = scanner.nextInt();
        System.out.println(Arrays.toString(shift(arr, left, step)));
    }

    public static int [] shiftRight(int[] arr) {
        int[] newArr = new int[arr.length];
        int value = arr[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            newArr[i + 1] = arr[i];
        }
        newArr[0] = value;
        return newArr;
    }

    public static int[] shiftLeft(int[] arr) {
        int[] newArr = new int[arr.length];
        int value = arr[0];
        for (int i = 1; i <= arr.length - 1; i++) {
            newArr[i - 1] = arr[i];
        }
        newArr[newArr.length - 1] = value;
        return newArr;

    }

    public static int[] shift(int[] array, boolean left, int shifts) {
        int [] newArr = array;
        while (shifts > 0) {
            if (!left) {
                newArr=shiftRight(newArr);
                shifts--;
            }

            if (left) {
                while (shifts > 0) {
                    newArr=shiftLeft(newArr);
                    shifts--;
                }
            }
        }
        return newArr;
    }
}