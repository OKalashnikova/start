import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by O&J on 29.09.2016.
 */

//КОЛЛЕКЦИИ

public class Webinar4 {
    // множества - Sets
    public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
   TreeSet<String> items = new TreeSet<>(); // Mnogestvo - spisok pokupok
        //HashSet<String> items = new HashSet<>();
    for(;;){
        System.out.println("Введите название покупки");
        String command = reader.readLine().trim();
        if(command.toLowerCase().equals("exit"))
            break;
        else if(command.toLowerCase().equals("list")){
            for (String item: items){
                System.out.println(item);
            }
        }else{
            items.add(command);}
    }
}
}
// Если два раза вввести одинаковый текст-предмет, то списов все-равно выведет один раз,
// н-р, если два раза в списке ввести сахар, а потом вывести список - сахар будет только один раз в тексте
