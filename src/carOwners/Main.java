package carOwners;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by O&J on 11.10.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        TreeMap<String, String> cars = new TreeMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(;;){
            System.out.println("Введите номер машины");
            String command = reader.readLine().trim().toUpperCase();
            if(command.equals("LIST")){
                if(cars.size() > 0) {
                    for (String item : cars.keySet()) {
                        System.out.println(cars.get(item) + " владелец машины с номером " + item);
                    }
                }else{
                    System.out.println("Машина отсутствует");
                }
            }else if(isCarNumber(command)){
                String com = cars.get(command);
                if(com != null)
                    System.out.println(com + " владелец машины с номером: " + command);
                else{
                    System.out.println("введите имя владельца машины машины");
                    com = reader.readLine().trim();
                    cars.put(command, com);
                }
            }else if(command.equals("EXIT")){
                break;
            }else
                System.out.println("Вы введт некорректный номер!");
        }
    }

    private static Pattern pattern = Pattern.compile("[АВЕКМНОРСТУХDABEKMHOPCTYX][\\d]{3}[АВЕКМНОРСТУХDABEKMHOPCTYX]{2}([\\d]{2,3})");
// bukva - tri cifry - bukva - dve cifry - kod regiona

    public static boolean isCarNumber(String testString) {
        Matcher matcher = pattern.matcher(testString);
        if (matcher.matches()) {
            int region = Integer.parseInt(matcher.group(1));
            if (region > 0 && region < 100 || region == 197 || region == 150 || region == 163 || region == 170) {
                return true;
            }

        }
        return false;
    }
}

// Если в этом классе, где находится
// основной запускающий метод (нить) есть еще методы, то они обязательно должны быть static