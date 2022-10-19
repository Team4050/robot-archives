public class Car {
    boolean engineRunning;
    int speed;
    String direction;

    public Car(String initDirection) {
        this.direction = initDirection;
        this.engineRunning = false;
    }

    public String currentDirection() {
        return this.direction;
    }

    public int currentSpeed() {
        return this.speed;
    }

    public void setEngineState(String engState) {
        if (engState == "Start") {
            if (engineRunning) {
                System.out.println("GRIND...GRIND... Engine already running!!!");
            } else {
                engineRunning = true;
                System.out.println("Gentlemen, start your engines...");
            }
        } else {
            if (!engineRunning) {
                System.out.println("Engine already stopped!!!");
            } else {
                engineRunning = false;
                System.out.println("Sputter... Stop");
            }
        }
    }

    public void forward() {
        System.out.println("Car is in Drive");
    }

    public void go() {
        System.out.println("Coasting along");
        this.speed = 2;
    }

    public void go(int newSpeed) {
        this.speed = newSpeed;
        System.out.println("Setting car speed to " + speed + "mph");
    }

    public void park() {
        if (this.speed != 0) {
            System.out.println("*** You should stop first ***");
        } else {
            System.out.println("Car is parked");
        }
    }

    public void stop() {
        System.out.println("Car comes to a halt");
        this.speed = 0;
    }

    public void turnLeft() {
        switch (direction) {
            case "North": direction = "West";
                          break;
            case "West": direction = "South";
                          break;
            case "South": direction = "East";
                          break;
            case "East": direction = "North";
                          break;
        }

        System.out.println("Blink...blink...blink... Turning left");
        System.out.println("... New Direction: " + direction);
    }

    public void turnRight() {
        switch (direction) {
            case "North": direction = "East";
                          break;
            case "East": direction = "South";
                          break;
            case "South": direction = "West";
                          break;
            case "West": direction = "North";
                          break;
        }
      
        System.out.println("Blink...blink...blink... Turning right");
        System.out.println("... New Direction: " + direction);
    }
}