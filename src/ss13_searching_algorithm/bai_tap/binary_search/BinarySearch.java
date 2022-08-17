package ss13_searching_algorithm.bai_tap.binary_search;

import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] array, int left, int right, int value) {
        int mid = (left + right) / 2;
        if (value == array[mid]) {
            return mid;
        }
        if (value > array[mid]) {
            return binarySearch(array, mid + 1, right, value);
        }
        if (value < array[mid]) {
            return binarySearch(array, left, mid - 1, value);
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {12, 76, 45, 3, 8, 62, 91, 100};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int value = 76;
        int result = binarySearch(arr, 0, arr.length - 1, value);
        if (result == -1) {
            System.out.println("Giá trị cần tìm không xuất hiện trong mảng");
        } else {
            System.out.printf("Giá trị %d xuất hiện trong mảng tại vị trí thứ %d", value, result);
        }


    }
}
