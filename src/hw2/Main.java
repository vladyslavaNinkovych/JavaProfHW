package hw2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter word:");
        while (true) {
            String word = sc.next();
            if (!word.equals("end")) {
                list.add(word);
            } else {
                break;
            }
        }
        System.out.println(list.toString());
    }
}
