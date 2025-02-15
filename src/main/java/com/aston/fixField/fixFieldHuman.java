package com.aston.fixField;

import lombok.Getter;

@Getter
public enum fixFieldHuman {
    MALE("Мужчина"),
    FEMALE("Женщина");
   private final String descreption;

    fixFieldHuman(String descreption) {
        this.descreption = descreption;
    }

}
