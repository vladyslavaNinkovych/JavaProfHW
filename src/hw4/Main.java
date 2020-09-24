package hw4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Login login = new Login();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter login:");
        while (true) {
            if (login.loginCheck(sc.next())) {
                System.out.println("Enter password:");
                break;
            } else {
                System.out.println("Invalid login.");
            }
        }

        while (true) {
            if (login.passwordCheck(sc.next())) {
                System.out.println("Logged in.");
                break;
            } else {
                System.out.println("Invalid password.");
            }
        }
    }
}
