import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by O&J on 07.10.2016.
 */
public class BinarySearchByHands {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Я угадаю - какое число от 0 до 1000 вы загадали");
        int min = 0;
        int max = 1000;
        int countAtTemp = 0;
        int randomNumber = Integer.parseInt(reader.readLine().trim());
        for(;;){
            int myAnswer = min + ((max - min)/2);
             if (myAnswer <randomNumber){
                min = myAnswer;
                countAtTemp++;
            }else if(myAnswer > randomNumber){
                max = myAnswer;
                countAtTemp++;
            }else if(myAnswer == randomNumber){
                System.out.println("Я угадал с попытки № " + countAtTemp);
                 break;
            }
        }
    }
}
