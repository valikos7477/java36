package com.aston;

import com.aston.entities.Human;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainApp {
    public static void main(String[] args) {

        List<Human> humans = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя");
        String lastname = scanner.nextLine();

        System.out.println("Введите возраст");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Введите пол");
        String gender = scanner.nextLine();

        Human newHuman = new Human(lastname, age, gender);
        newHuman.saveToArray(humans);

        // Вывод всех добавленных людей
        System.out.println("\nВсе добавленные люди:");
        for (Human human : humans) {
            System.out.println(human);
        }
        scanner.close();
    }
}