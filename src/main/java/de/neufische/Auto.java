package de.neufische;

import java.sql.SQLOutput;

public class Auto extends Verhicle{
    public Auto(int id, String name, int velocity) {
        super(id, name, velocity);
    }

    @Override
    public int accelerate(int kmh) {
        int endVelocity=super.getVelocity()+kmh;
        System.out.println("Auto is accelerated to " + endVelocity);
        return endVelocity;
    }


}
