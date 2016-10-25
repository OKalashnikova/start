import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by O&J on 10.09.2016.
 */
public class StringHW {
    public static void main(String[] args) {
        // Home work
        // 1) вывести колличество слов в тексте
        String alice = "or a minute or two she stood looking at the house, and wondering what to do next, when suddenly a footman in livery came running out of the wood–(she considered him to be a footman because he was in livery: otherwise, judging by his face only, she would have called him a fish)–and rapped loudly at the door with his knuckles. It was opened by another footman in livery, with a round face, and large eyes like a frog; and both footmen, Alice noticed, had powdered hair that curled all over their heads. She felt very curious to know what it was all about, and crept a little way out of the wood to listen. The Fish-Footman began by producing from under his arm a great letter, nearly as large as himself, and this he handed over to the other, saying, in a solemn tone, `For the Duchess. An invitation from the Queen to play croquet.’ The Frog-Footman repeated, in the same solemn tone, only changing the order of the words a little, `From the Queen. An invitation for the Duchess to play croquet.’";
        String[] wordsAlice = alice.split("\\W+");
        int count=0;
//        for(String s: wordsAlice){
//            System.out.println(s);
//            count+=1;
        System.out.println("Колличество слов в тексте "+ wordsAlice.length);

        // 2) есть текст. Необходимо вывести сумму заработанных денег троих человек

        String text = "Коля заработал 10000 гривен, Миша - 17563 гривны, а Катя - 50000 гривен";
        Pattern p = Pattern.compile("\\d+"); //находим все числа в тексте при помощи регулярных выражений
        Matcher m = p.matcher(text);
        ArrayList<String> n = new ArrayList<>(); //Списочный массив позволяет добавить значения в ячейки, при этом это остается тем же самым объектом, если ячеек становится больше чем было изначально
        int b=0;
        while(m.find()){
            String i = m.group();
            n.add(i);
//            System.out.println(m.group(0));
//            System.out.println(text.substring(m.start(), m.end()));
            //System.out.println(i);
        }
        System.out.println(n.toString());
        int sum =0;
        for (int i = 0; i < n.size(); i++) {
            sum+= Integer.parseInt(n.get(i));
        }
        System.out.println("Сумма зарплат троих человек равна " + sum);
        }
    }

