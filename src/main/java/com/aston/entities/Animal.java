package com.aston.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import java.util.List;

@AllArgsConstructor
@Getter
@ToString

public class Animal implements Sortable {

    private String species;
    private String ColorEay;
    private boolean isFur;

    @Override
    public void saveToArray(List array) {
        array.add(this);
    }


}
