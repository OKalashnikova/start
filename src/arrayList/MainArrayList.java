package arrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by O&J on 28.09.2016. КОЛЛЕКЦИИ
 */
public class MainArrayList {
    public static void main(String[] args) throws IOException {
        // ochered FIFO (first input first output)

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> pacients = new ArrayList<>();
        for(;;){
            System.out.println("Пожалуйста, представьтесь!");
            String name = reader.readLine();
            pacients.add(name);
            if(pacients.size() > 5) { // vozvraschaet kollichestvo v spiske (dlinu spiska)
            String nextPacient = pacients.remove(0);
                System.out.println("Следующий пациент: " + nextPacient);
            }
        }

        //stack LIFO


        /*
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            names.add("Name " + i);
        }
        names.add(0, "Vera");
        System.out.println(names.get(2)); // v skobkah index yacheyki, iz kotoroy dostaem imya
//        for (String s : names) {
//            System.out.println(s);
//        }
*/
    }
}
