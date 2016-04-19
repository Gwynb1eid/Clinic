package Clinic;

import Clinic.Clinic;

public class ClinicRunner {

    public static void main(String[] args) {
        final Clinic clinic = new Clinic(10);

        clinic.addClient(0, new Client("Brown", new Cat("Digy")));
        clinic.addClient(1, new Client("Nick", new Dog(new Animal("Sparky"))));

    }

}
