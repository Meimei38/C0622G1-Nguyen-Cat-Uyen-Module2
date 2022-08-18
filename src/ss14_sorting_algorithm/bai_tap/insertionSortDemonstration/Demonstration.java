package ss14_sorting_algorithm.bai_tap.insertionSortDemonstration;

import java.util.Arrays;

public class Demonstration {
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j];
                System.out.println(Arrays.toString(arr));

            }
            arr[j + 1] = key;
            System.out.println(Arrays.toString(arr));


        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        int [] array ={3,7,6,5,4,0,1,2,1};
        insertSort(array);


    }
}
