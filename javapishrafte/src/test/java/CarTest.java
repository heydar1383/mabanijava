public class CarTest {

     class Mashin extends CarTest {
        boolean CarIsOn;
        boolean DoorIsCloe;

        void on() {
            CarIsOn = true;
        }

        void off() {
            CarIsOn = false;
        }

        void opendoor() {
            DoorIsCloe = false;
        }

        void closedoor() {
            DoorIsCloe = true;
        }

        void run() {
            if (DoorIsCloe == true && CarIsOn == true) {
                System.out.println("we can run");
            }


        }
    }
}

