package hw2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int size = sc.nextInt();
        getIntegerList(size, list);
        System.out.println("Min value: " + getMinimum(list));
    }

    private static void getIntegerList(int size, List<Integer> list) {
        System.out.println("Enter " + size + " numbers");
        for (int i = 0; i < size; i++) {
            Scanner sc = new Scanner(System.in);
            list.add(sc.nextInt());
        }
    }

    private static Integer getMinimum(List<Integer> list) {
        if (!list.isEmpty()) {
            Iterator<Integer> iterator = list.iterator();
            int min = iterator.next();
            while (iterator.hasNext()) {
                int value = iterator.next();
                if (value < min)
                    min = value;
            }

            return min;
        }
        return null;
    }
}
