package com.aston.entities;

import java.util.List;

public  interface Sortable<T> {
    void saveToArray(List<T> array);
}
