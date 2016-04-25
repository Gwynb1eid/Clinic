package Clinic;

import Clinic.Clinic;
import Menu.ClinicMenu;
import Menu.MenuAction;
import Clinic.Clinic.ClinicRunner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClinicRunner {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";

        final Clinic clinic = new Clinic(10);

        clinic.addClient(0, new Client("Brown", new Cat("Diggy")));

        clinic.addClient(1, new Client("Nick", new Dog(new Animal("Sparky"))));

        clinic.addClient(2, new Client("Ann", new CatDog(new Cat("Tom"), new Dog(new Animal("Piccy")))));

        while(true) {
            ClinicMenu.menu();
            try {
                s = br.readLine();
            } catch (IOException e) {}

            if (s.equals("exit")) {
                break;
            }

            MenuAction.action(Byte.parseByte(s));


        }


    }

}
