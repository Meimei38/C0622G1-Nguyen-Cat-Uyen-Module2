package ss11_stack_queue.bai_tap.count_occurrences.service.impl;

import java.util.Set;
import java.util.TreeMap;

public class MainService {

    public static void displayMap(TreeMap<String, Integer> map) {
        Set<String> keySet = map.keySet();
        for (String item : keySet) {
            System.out.printf("%s; value: %s \n", item, map.get(item));
        }
    }

    public static void checkWord(TreeMap<String, Integer> map, String input) {
        Set<String> keySet = map.keySet();
        for (String item : keySet) {
            if (item.equals(input)) {
                int value = map.get(item);
                map.put(item, value + 1);
                return;
            }
        }
        map.put(input, 1);
    }
}
