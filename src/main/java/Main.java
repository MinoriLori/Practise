import Entity.Cat;
import Entity.Human;
import Entity.Robot;
import Entity.Truck;
import obstacles.Obstacle;
import obstacles.Treadmill;
import obstacles.Wall;

public class Main {
    public static void main(String[] args) {
        Truck participants[] = {
                new Cat(),
                new Robot(),
                new Human()
        };

        Wall[]walls = {
                new Wall(100),
                new Wall(100),
                new Wall(100),
        };

        Treadmill[]treadmill = {
               new Treadmill(100),
               new Treadmill(100),
               new Treadmill(100),

        };

        getScore(walls,participants);

    }

    static void getScore(Obstacle [] obstacle, Truck [] truck){
        for (Obstacle obstacle1 : obstacle){
            for ( Truck truck1 : truck){
                if (!obstacle1.action(truck1)) continue;
            }
        }
    }
}
