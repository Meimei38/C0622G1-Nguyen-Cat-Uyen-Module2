package ss4_class_object.bai_tap.stopwatch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.setStart();
        int[] arr = new int[100000];


        for (int i = 0; i < 100000; i++) {
            arr[i] = (int) Math.floor(Math.random() * 100);
        }
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }

        }
        stopWatch.setStop();
//        System.out.println(stopWatch.stop());
        System.out.println("Process time: " + stopWatch.getElapsedTime());
    }
}
