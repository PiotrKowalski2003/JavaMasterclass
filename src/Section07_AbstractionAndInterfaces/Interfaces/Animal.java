package Section07_AbstractionAndInterfaces.Interfaces;

interface FlightEnabled {

    void takeOff();
    void land();
    void fly();

}

interface Trackable {

    void track();
}


public abstract class Animal {

    public abstract void move();
}

