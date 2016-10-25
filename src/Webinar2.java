import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by O&J on 10.09.2016.
 */
public class Webinar2 {

    public static void main(String[] args) {
        System.out.println("Home work // шахматная доска");
        System.out.println("\n");

        int whiteCell = 9989;
        int blackCell = 9724;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(i%2 == 1) {
                    if(j%2 == 1) {
                        System.out.print((char) whiteCell + " ");
                    }else{
                        System.out.print((char) blackCell + " ");
                    }
                }else{
                    if(j%2 == 1){
                        System.out.print((char)blackCell + " ");
                    }else{
                        System.out.print((char)whiteCell +" ");
                    }

                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Home work // Простые числа"); // Все простые числа не могут быть четными очень классная задача!!!!
        System.out.println("\n");

        for(int i = 3; i< 10000; i +=2){
            boolean isPrime = true;
            for (int j = 3; j < i; j +=2) {
                if (i%j ==0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.println(i);
        }


        System.out.println();
        System.out.println("Home work // Колличество ящиков с провизией для высадки на Марс"); // Все простые числа не могут быть четными очень классная задача!!!!
        System.out.println("\n");

        System.out.println("Введите пожалуйста количество ящиков с провизией для высадки на Марс");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countBoxes = 0;
        try{
            countBoxes = Integer.parseInt(reader.readLine());
        }catch (IOException e){
            e.printStackTrace();
        }
        int countSpiceShip = 0;
        int countContaners = 0;
        int boxesInContaner = 34;
        int contenersInTrack = 11;
        for (int i = 0; i< countBoxes; i++){
            if(i%(contenersInTrack*boxesInContaner) == 0){
                System.out.println("Ракета " + (countSpiceShip + 1));
                countSpiceShip++;
            }
            if(i%boxesInContaner == 0){
                System.out.println("Контейнер " + (countContaners +1));
            }
            System.out.println("Ящик " + (i+1));
        }
        System.out.println("Всего грузовиков: " + countSpiceShip);
        System.out.println("Всего контейнеров: " + countContaners);

        System.out.println("\n");
        System.out.println("Home work // Сложить сумму чисел из текста" + "\n");

        String text = "Коля заработал 10000 гривен, Миша - 17563 гривны, а Катя - 50000 гривен";
        Pattern p = Pattern.compile("\\d+"); //находим все числа в тексте при помощи регулярных выражений
        Matcher m = p.matcher(text);
        int indexStart = text.indexOf("Миша");
        System.out.println(text.substring(indexStart));
        System.out.println(text.substring(indexStart, indexStart+4));
//            System.out.println(m.group(0));
//            System.out.println(text.substring(m.start(), m.end()));



        System.out.println();
        System.out.println("// Регулярные выражения");
        System.out.println("\n");

        String telephone = "+38 (068) 335-89-97";
        System.out.println(telephone.replaceAll("\\W+",""));

        System.out.println();
        System.out.println("// работа с текстом - разбиваем на слова");
        System.out.println("\n");

        String alice = "or a minute or two she stood looking at the house, and wondering what to do next, when suddenly a footman in livery came running out of the wood–(she considered him to be a footman because he was in livery: otherwise, judging by his face only, she would have called him a fish)–and rapped loudly at the door with his knuckles. It was opened by another footman in livery, with a round face, and large eyes like a frog; and both footmen, Alice noticed, had powdered hair that curled all over their heads. She felt very curious to know what it was all about, and crept a little way out of the wood to listen. The Fish-Footman began by producing from under his arm a great letter, nearly as large as himself, and this he handed over to the other, saying, in a solemn tone, `For the Duchess. An invitation from the Queen to play croquet.’ The Frog-Footman repeated, in the same solemn tone, only changing the order of the words a little, `From the Queen. An invitation for the Duchess to play croquet.’";
        String[] wordsAlice = alice.split("\\W+");
        for (String s: wordsAlice) {
            System.out.println(s);
        }
    }
}
