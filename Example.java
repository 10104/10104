public class Example {
     int maxspeed;
    int speedperhr;

    public void fullThrottle()
    {
        if (speedperhr== maxspeed)
        {
            System.out.println("My car is in full speed");
        }
        else {
            System.out.println("Not in full speed");
        }
    }
    public void speed()
    {
        System.out.println(speedperhr);
    }

    public static void main(String[] args) {
        Example myCar = new Example();
        myCar.maxspeed = 200;
        myCar.speedperhr=70;
        myCar.speed();
        myCar.fullThrottle();
    }
}

