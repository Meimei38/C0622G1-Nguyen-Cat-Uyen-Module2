package ss11_stack_queue.bai_tap.count_occurrences.controller;

import ss11_stack_queue.bai_tap.count_occurrences.service.impl.MainService;

import java.util.Scanner;
import java.util.TreeMap;

public class MainController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, Integer> wordMap = new TreeMap<>();
        wordMap.put("Nguyễn Thanh Hải", 1);
        wordMap.put("Phạm Thị Minh Châu", 1);
        wordMap.put("Lê Đức Vịnh", 1);
        wordMap.put("Lê Bá Hoàng Giang", 1);
        wordMap.put("Bùi Minh Tiến", 1);
        wordMap.put("Nguyễn Duy Quang", 1);
        wordMap.put("Phạm Quang Vinh", 1);
        wordMap.put("Đỗ Hoàng Đức", 1);
        MainService.displayMap(wordMap);
        String words;
        do {
            System.out.println("Vui lòng nhập chuỗi: ");
            words = scanner.nextLine();
            if (words.equals("")) {
                break;
            }
            MainService.checkWord(wordMap, words);
            MainService.displayMap(wordMap);
        } while (true);

    }
}
