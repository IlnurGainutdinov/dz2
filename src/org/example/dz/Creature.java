package org.example.dz;

public abstract class Creature {
    int run;
    int jump;
    String name;

    public Creature(int run, int jump, String name) {
        this.run = run;
        this.jump = jump;
        this.name = name;
    }
    abstract void running(int runDistance);
    abstract void jumping(int jumpHeight);

}
