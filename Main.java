package vn.edu.rikkei.session16.ex01;

import java.util.List;
import java.util.Arrays;

public class Main {
    private static final int WIDTH = 55;

    public static void main(String[] arg) {
        List<Integer> numbers = Arrays.asList(15, 22, 8, 91, 44, 3, 60);

        System.out.print("""
                --- LỌC SỐ VỚI FUNCTIONAL INTERFACE PREDICATE ---
                Danh sách gốc: [15, 22, 8, 91, 44, 3, 60]
                Lọc 1: Số chẵn (n -> n % 2 == 0)
                Lọc 2: Số lớn hơn 30 (n -> n > 30)
                """);

        printOutput(null);
        printOutput(centerText("BỘ LỌC SỐ LIỆU LAMBDA PREDICATE  "));
        printOutput(null);

        printOutput(" [Điều kiện: Số chẵn]");
        NumberFilter.filterNumbers(numbers, n -> n % 2 == 0);
        printDivider();

        printOutput(" [Điều kiện: Số lớn hơn 30]");
        NumberFilter.filterNumbers(numbers, n -> n > 30);

        printOutput(null);

    }
    //content == null thi in duong vien, nguoc lai thi in 1 dong co noi dung
    static void printOutput(String content) {
        if (content == null) {
            System.out.printf("+%s+%n", "-".repeat(WIDTH));
        } else {
            System.out.printf("|%-" + WIDTH + "s|%n", content);
        }
    }

    private static void printDivider() {
        System.out.printf("|%s|%n", "-".repeat(WIDTH));
    }

    private static String centerText(String text) {
        int padding = Math.max((WIDTH - text.length()) / 2, 0);
        return " ".repeat(padding) + text;
    }
}
