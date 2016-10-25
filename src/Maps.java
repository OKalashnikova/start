import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.TreeMap;

/**
 * Created by O&J on 08.10.2016.
 */
public class Maps {
    // maps карты данных, ключи значения
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //HashMap<String, Integer> candys = new HashMap<>();
        TreeMap<String, Integer> candys = new TreeMap<>();
        for(;;){
            System.out.println("Назовите имя воспитанника");
            String command = reader.readLine().trim();
            // К задаче про машины - номера и их владельцы
//            try {
//                Integer numAuto = Integer.parseInt(command);
//            }catch (Exception ex) {
//                System.out.println("ввод некорректен!");
//                continue;
//            }
            if(command.equals("list")){
                for (String name: candys.keySet()){
                System.out.println(name + ": получил(а) конфет " + candys.get(name));}
            }else if (command.equals("exit")){
                break;
            }else{
                Integer candysCount = candys.get(command);
                if (candysCount == null){
                    candysCount = 0;
                }
                candys.put(command, candysCount+1);
            }
        }
    }
}
