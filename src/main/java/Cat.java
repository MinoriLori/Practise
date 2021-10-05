class Cat implements Truck{

    private final int limitation_run = 200, limitation_height = 200;

    @Override
    public boolean jump(Wall wall) {
        if (limitation_height > wall.getHeight()){
            System.out.println("Кот прыгает");
            return true;
        } else {
            System.out.println("Кот не может перепрыгнуть препятствие");
            return false;
        }
    }

    @Override
    public boolean run(Treadmill treadmill) {
        if (treadmill.getLength() > limitation_run){
            System.out.println("Кот бежит" + treadmill.getLength());
            return false;
        }
        else {
            System.out.println("Кот не может преодолеть препятствие");
            return false;
        }
    }
}
