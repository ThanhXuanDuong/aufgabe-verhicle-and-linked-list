package de.neufische;

import de.neufische.linkedlist.Animal;
import de.neufische.linkedlist.AnimalList;
import de.neufische.linkedlist.AnimalListItem;


public class Main {
    public static void main(String[] args) throws Exception {
/*
        // Aufgabe Vehicle
        Verhicle auto=new Auto(1,"Audi",50);
        Verhicle fahrrad1=new Fahrrad(2,"ABC",24);
        Verhicle fahrrad2=new Fahrrad(3,"ABC",24);
        auto.accelerate(15);
        fahrrad1.accelerate(10);
        fahrrad2.accelerate(15);

*/
        // Aufgabe Linked List Implementation
        AnimalList list= new AnimalList(new AnimalListItem(new Animal("a")));
        list.addItem(new Animal("b"));
        list.addItem(new Animal("c"));
        list.addItem(new Animal("d"));
        list.addItem(new Animal("c"));
        list.addItem(new Animal("e"));
        list.removeItem("c");

        System.out.println(list);
    }

}