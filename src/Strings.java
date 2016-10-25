/**
 * Created by O&J on 07.09.2016.
 */
public class Strings {
    public static void main(String[] args) {
        String text = "We have a good house and big flat in the downtown in Kiev";
        System.out.println(text.length());
        char ch = text.charAt(50);
        System.out.println(ch);
        System.out.println(text.substring(32));
        System.out.println(text.indexOf("house"));

        int index = text.indexOf("and");
        System.out.println(text.substring(index, index+3));
        System.out.println("--------------------");

      StringBuilder sb = new StringBuilder(); // Изменяемій объект
        String text2 = "some text ";
        //String s = "";
        for (int i = 0; i <100 ; i++) {
            // text2+=text2; - съедает всю память heap - надо добавлять к другой переменной текст, чтобы вышло 100 раз
           // s+=text2; // но это тоже неправильно, так как 100 раз создается новый объект и сто раз съедается память
            sb.append(text2);
        }
        System.out.println(sb.toString());
        System.out.println("--------------------");

        // Home work
        // вывести колличество слов в тексте
        String alice = "For a minute or two she stood looking at the house, " + "and wondering what to do next, when suddenly a footman" + " in livery came running out of the wood";
        String[] wordsAlice = alice.split("\\W+");
        int count=0;
        for(String n: wordsAlice){
            System.out.println(n);
            count+=1;
        }

        System.out.println("Колличество слов в тексте "+ count);

    }
}




