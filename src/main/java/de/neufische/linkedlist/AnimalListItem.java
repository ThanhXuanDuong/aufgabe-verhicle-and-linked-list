package de.neufische.linkedlist;

import lombok.AllArgsConstructor;
import lombok.Data;

public class AnimalListItem {
     Animal value ;
     AnimalListItem next;

    public AnimalListItem(Animal value) {
        this.value = value;
        next=null;
    }

    @Override
    public String toString() {
        return "AnimalListItem{" +
                "value=" + value +
                '}';
    }
}
