package ch08.lecture.p1interface.Ex;

import ch07.lecture.p2Polymorphism.Ex.Bus;
import ch07.lecture.p2Polymorphism.Ex.Taxi;
import ch07.lecture.p2Polymorphism.Ex.Vehicle;

public class InstanceofEx {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        Bus bus = new Bus();

        ride(taxi);
        System.out.println();
        ride(bus);
    }



    public static void ride(Vehicle vehicle){
//        if (vehicle instanceof Bus){
//            Bus bus = (Bus) vehicle;
//            bus.checkFare();
//        }
        if (vehicle instanceof Bus bus) {
            bus.checkFare();
        }

        vehicle.run();
        }
}

