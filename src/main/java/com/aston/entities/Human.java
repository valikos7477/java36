package com.aston.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor  // Генерирует конструктор с аргументами для всех полей
@Getter               // Генерирует геттеры для всех полей
@ToString            // Генерирует метод toString для вывода объекта в читаемом виде
public class Human {
    private String lastName;  // Фамилия
    private int age;          // Возраст
    private String gender;    // Пол
}