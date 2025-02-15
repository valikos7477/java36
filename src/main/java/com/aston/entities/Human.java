package com.aston.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor  // Генерирует конструктор с аргументами для всех полей
@Getter               // Генерирует геттеры для всех полей
@ToString            // Генерирует метод toString для вывода объекта в читаемом виде
public class Human implements Sortable<Human> {
    private String lastName;  // Фамилия
    private int age;          // Возраст
    private String gender;    // Пол

    @Override
    public void saveToArray(List<Human> array) {
        array.add(this); // Добавляем текущий объект в массив
    }

}