package de.neufische.linkedlist;


import java.util.ArrayList;
import java.util.List;

public class AnimalList {
    private AnimalListItem head;
    public AnimalList(AnimalListItem head) {
        this.head = head;
    }

    public void add(Animal newAnimal){
        AnimalListItem newItem=new AnimalListItem(newAnimal);
        if (head.value==null) {
           head =newItem;
        }else {
            AnimalListItem lastItem=head;
            while (lastItem.next!=null){
                lastItem=lastItem.next;
            }
            lastItem.next=newItem;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        AnimalListItem currItem=head;
        while (currItem != null){
                result.append(currItem.value.toString()).append("->");
                currItem = currItem.next;
        }
        return result.toString();
    }
}
