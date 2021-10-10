package obstacles;

import Entity.Truck;

public class Treadmill extends Obstacle{
    private int length;

    public Treadmill(int length){
        this.length = length;
    }

    public int getLength(){
        return this.length;
    }

    public boolean action(Truck truck){
        return truck.run(this.length);
    }
}
