public class Main {
    public static void main(String[] args) {
        Truck participants[] = {
                new Cat(),
                new Robot(),
                new Human()
        };

        Wall []walls = {
                new Wall(100),
                new Wall(100),
                new Wall(100),
        };

        Treadmill []treadmill = {
               new Treadmill(100),
               new Treadmill(100),
               new Treadmill(100),

        };

        passObstacles(participants,walls);
    }

    static void passObstacles(Truck trucks[],Treadmill[]treadmills){
        for (Truck truck : trucks){
            for (Treadmill treadmill: treadmills ){
                if (truck.run(treadmill)){
                    continue;
                }
            }
        }
    }

    static void passObstacles(Truck trucks[],Wall[]walls){
        for (Truck truck : trucks){
            for (Wall wall: walls){
                if (truck.jump(wall)){
                    continue;
                }
            }
        }
    }
}
