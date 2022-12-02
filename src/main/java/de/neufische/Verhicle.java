package de.neufische;

public abstract class Verhicle implements Accelerateable {
    private int id;
    private String name;
    private int velocity;

    public Verhicle(int id, String name, int velocity) {
        this.id = id;
        this.name = name;
        this.velocity = velocity;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    @Override
    public String toString() {
        return "Verhicle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", velocity=" + velocity +
                '}';
    }
}
