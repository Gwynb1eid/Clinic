package Menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClinicMenu {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void menu() {
        System.out.println("1. Add client");
        System.out.println("2. Add pet");
        System.out.println("3.Find by pet");
        System.out.println("4. Find by name");
        System.out.println("5. Edit name");
        System.out.println("6. Edit pet");
        System.out.println("7. Delete client");
        System.out.println("8. Delet pet");

        MenuAction.action(br.readLine());

    }
}
