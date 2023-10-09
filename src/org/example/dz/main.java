package org.example.dz;

public class main {
    public static void main(String[] args) throws InterruptedException {
        Creature[] creatures = {
                new Human(500, 2, "Иван"),
                new Cat(100, 1, "Мурзик"),
                new Robot(1000, 3, "Rob")
        };
        Obstacle[] obstacles = {
                new TreadMill(50, 0),
                new Wall(0, 1),
                new TreadMill(400, 0),
                new Wall(0,3)
        };
        for (Obstacle obstacle : obstacles) {
            for (Creature creature : creatures) {
                if (obstacle instanceof TreadMill ){
                    creature.running(obstacle.lenght);
                    if (obstacle.lenght > creature.run){
                        System.out.println(creature.name + " вылетает из дистанции");;
                    }
                }
                if (obstacle instanceof Wall ) {
                    creature.jumping(obstacle.height);
                    if (obstacle.height > creature.jump){
                        System.out.println(creature.name + " вылетает из дистанции");;
                    }
                }
            }
        }

    }
}
