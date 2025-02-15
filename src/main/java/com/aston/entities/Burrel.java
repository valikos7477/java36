package com.aston.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor  // Генерирует конструктор с аргументами для всех полей
@Getter               // Генерирует геттеры для всех полей
@ToString
public class Burrel implements Sortable<Burrel> {
    @Override
    public void saveToArray(List<Burrel> array) {
        array.add(this); // Добавляем текущий объект в массив
    }

    private String material;
    private String contents;
    private int volume;
}
