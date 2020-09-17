package hw2;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter word:");
        for (int i = 0; i < 5; i++) {
            String value = sc.next();
            value = doubleValue(value);
            list.add(value);
        }

        for (String value : list) {
            System.out.println(value);
        }
    }

    private static String doubleValue(String value) {
        return value.concat(value);
    }

}
