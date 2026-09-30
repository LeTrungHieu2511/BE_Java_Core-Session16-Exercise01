package vn.edu.rikkei.session16.ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

// bộ lọc số nguyên
public class NumberFilter {

    // duyet danh sach, so nao thoa man thi in ra
    public static void filterNumbers(List<Integer> list, Predicate<Integer> predicate) {
        List<String> matched = new ArrayList<>();

        for (Integer num : list) {
            if (predicate.test(num)) {
                matched.add(String.valueOf(num));
            }
        }

        Main.printOutput(" -> Kết quả lọc: " + String.join(", ", matched));
    }


}