package de.neufische;

public class Fahrrad extends Verhicle{
    public Fahrrad(int id, String name, int velocity) {
        super(id, name, velocity);
    }

    @Override
    public int accelerate(int kmh) throws Exception {
        int endVelocity=super.getVelocity()+ kmh;
        if (endVelocity<35){
            System.out.println("Bicycle is accelerated to " + endVelocity);
        }else {
            throw new Exception("Too fast! Cannot be accelerated!");
        }
        return endVelocity;
    }
}
