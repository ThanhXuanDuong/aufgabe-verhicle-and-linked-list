package de.neufische.linkedlist;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
public class Animal {
    private String name;

    @Override
    public String toString() {
        return  name;
    }
}
