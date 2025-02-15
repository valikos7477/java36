package com.aston.fixField;

import lombok.Getter;

public class Burrel {
    @Getter
    public enum burrelMaterial{
        METALL("Металл"),
        PLASTIC("Пластик"),
        WOOD("Дерево");

        private final String description;

        burrelMaterial(String description) {
            this.description = description;
        }
    }
    @Getter
    public enum contentsOfTheBurrel{
        GUS("Бензин"),
        OIL("Масло"),
        WATER("Вода");
        private final String desription;

        contentsOfTheBurrel(String desription) {
            this.desription = desription;
        }
    }

}
