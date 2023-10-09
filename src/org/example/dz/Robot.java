package org.example.dz;

public class Robot extends org.example.dz.Creature {
    public Robot(int run, int jump, String name) {
        super(run, jump, name);
    }

    @Override
    void running(int runDistance) {
        if (runDistance <= run) {
            System.out.println(name + " успешно пробежал");
        } else {
            System.out.println(name + " не смог пробежать");
        }
    }

    @Override
    void jumping(int jumpHeight) {
        if (jumpHeight <= jump){
            System.out.println(name + " успешно перепрыгнул");
        } else {
            System.out.println(name + " не смог перепрыгнуть");
        }
    }
}
