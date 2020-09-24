package hw2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Map<String, String> newMap = new HashMap<>();
        newMap.put("Москва", "Ивановы");
        newMap.put("Киев", "Петровы");
        newMap.put("Лондон", "Абрамовичи");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите город проживания:");
        String key = sc.next();
        System.out.println(newMap.get(key));
    }
}
