package algorithm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Algo2 {
    public static void main(String[] args) {
        int[] a = {-1, 150, 190, 170, -1, -1, 160, 180};
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            array.add(a[i]);
        }
        List<Integer> height = new ArrayList<>();
        List<Integer> index = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1) {
                height.add(a[i]);
            } else {
                index.add(i);
            }

        }
        Collections.sort(height);
        System.out.println(height.toString());
        for (int i = 0; i < index.size(); i++) {
            height.add(index.get(i), -1);

        }

        int [] result = new int[height.size()];
        for(int i=0; i<result.length;i++){
            result[i]=height.get(i);
        }


    }
}
