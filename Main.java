package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Введите имя: ");
        name = scanner.next();
        if (name.contains("Вячеслав")) {
            System.out.print("Привет, " + name);
        } else {
            System.out.print("Нет такого имени");
        }
    }
}