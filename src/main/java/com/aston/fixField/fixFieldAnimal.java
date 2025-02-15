package com.aston.fixField;

import lombok.Getter;

public class fixFieldAnimal {
    @Getter
    public enum animalGroup{
        MAMMALS("Животные"),
        BIRDS("Птицы"),
        FISH("Рыбы"),
        AMPHIBIANS("Амфибии");

        private final String description;

        animalGroup(String description) {
            this.description = description;
        }
    }
    @Getter
    public enum isFur{
        isFUR("Шерсть");
        private final String description;

        isFur(String description) {
            this.description = description;
        }
    }

}
