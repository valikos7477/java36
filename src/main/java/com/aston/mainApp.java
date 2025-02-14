package com.aston;

import com.aston.entities.Human;

import java.util.ArrayList;
import java.util.Scanner;

public class mainApp {
    public static void main(String[] args) {
        ArrayList<Human> Arrhumans = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя");
        String lastname = scanner.nextLine();

        System.out.println("Введите возраст");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Введите пол");
        String gender = scanner.nextLine();

        Human Newhuman = new Human(lastname, age, gender);
        Arrhumans.add(Newhuman);

        System.out.println("\nВсе добавленные люди:");
        for (Human human : Arrhumans) {
            System.out.println(human);
        }

        scanner.close();






}
}