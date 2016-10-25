import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by O&J on 15.10.2016.
 */
public class CarPark {
    public static void main(String[] args) throws IOException {
        ArrayList<String> flys = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (; ; ) {
            System.out.println("Enter command: ");
            String command = reader.readLine().trim();
            if (command.equals("exitAll")) {
                if (flys.size() > 0) {
                    for (int i = flys.size() - 1; i >= 0; i--) {
                        System.out.println("car " + flys.remove(i) + " left");
                    }
                } else
                    System.out.println("parking is empty!");
            } else if (command.equals("exit")) {
                if (flys.size() > 0)
                    System.out.println("car " + flys.remove(flys.size() - 1) + " left");
                else
                    System.out.println("last car is absent, parking is empty!");
            } else if (flys.size() == 5)
                System.out.println("Parking is full");
            else
                System.out.println("Car came in to parking - " + flys.add(command));
        }
    }
}
