public class Workshop2InClass {
    public static void main(String args[]) {
        Car myCar = new Car("North");

        myCar.setEngineState("Stop"); 
        myCar.setEngineState("Start"); 
        myCar.forward();
        myCar.go();
        myCar.go(25);
        System.out.println("Spedometer says " + myCar.currentSpeed() + "mph");
        myCar.stop();
        myCar.setEngineState("Start"); 
        myCar.turnLeft();
        myCar.go(35);
        myCar.turnLeft();
        myCar.go(50);
        myCar.turnRight();
        myCar.park();
        myCar.stop();
        myCar.park();
        System.out.println("Car is facing " + myCar.currentDirection());
        myCar.setEngineState("Stop"); 
    }
}