import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by O&J on 06.09.2016.
 */
public class MathContinueBuffreader {
    static int throwBone;

    public static void main(String[] args) {
//        for (int i = 0; i<100; i++){
//            int d = (int)(1+Math.random()*6);
//            System.out.println(d);
//        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        for(;;){
//            int throwBone = (int)(1+Math.random()*6);
//            System.out.println("Попробуйте угадать...");
//            int yourAnswer;
//            try {
//                yourAnswer = Integer.parseInt(reader.readLine());
//            } catch (Exception e) {
//                //e.printStackTrace(); функция распечатывает информацию об ошибке
//                System.out.println("некорректній ввод");
//               // yourAnswer = 0; - это было нужно, пока не было оператора continue; эта переменная падала ниже в сравнение.
//                // Теперь не падает и цикл предлагает новое число. Так мы сожраняем память
//                continue;
//            }
//            System.out.println("Выполняется оператор сравнения");
//            if(throwBone == yourAnswer){
//                System.out.println("Вы угадали! Парарам!");
//                break;
//            }
//        }
        System.out.println("наиболее частое число при кидании двух костей");
        int rare2 = 0;
        int rare3 = 0;
        int rare4 = 0;
        int rare5 = 0;
        int rare6 = 0;
        int rare7 = 0;
        int rare8 = 0;
        int rare9 = 0;
        int rare10 = 0;
        int rare11 = 0;
        int rare12 = 0;

        for (int i = 0; i < 100; i++) {
            int throwBone1 = (int) (1 + Math.random() * 6);
            int throwBone2 = (int) (1 + Math.random() * 6);
            throwBone = throwBone1 + throwBone2;
            System.out.println("Summ of bones is " + throwBone);


            if (throwBone == 2) {
                rare2 += 1;
            }

            if (throwBone == 3) {
                rare3 += 1;
            }

            if (throwBone == 4) {
                rare4 += 1;
            }

            if (throwBone == 5) {
                rare5 += 1;
            }

            if (throwBone == 6) {
                rare6 += 1;
            }

            if (throwBone == 7) {
                rare7 += 1;
            }

            if (throwBone == 8) {
                rare8 += 1;
            }
            if (throwBone == 9) {
                rare9 += 1;
            }
            if (throwBone == 10) {
                rare10 += 1;
            }

            if (throwBone == 11) {
                rare11 += 1;
            }

            if (throwBone == 12) {
                rare12 += 1;
            }
            /*
            System.out.println("Колличество выпадения суммы -2- " + rare2);
            System.out.println("Колличество выпадения суммы -3- " + rare3);
            System.out.println("Колличество выпадения суммы -4- " + rare4);
            System.out.println("Колличество выпадения суммы -5- " + rare5);
            System.out.println("Колличество выпадения суммы -6- " + rare6);
            System.out.println("Колличество выпадения суммы -7- " + rare7);
            System.out.println("Колличество выпадения суммы -8- " + rare8);
            System.out.println("Колличество выпадения суммы -9- " + rare9);
            System.out.println("Колличество выпадения суммы -10- " + rare10);
            System.out.println("Колличество выпадения суммы -11- " + rare11);
            System.out.println("Колличество выпадения суммы -12- " + rare12);
            */
        }
            if (rare2 > rare3 && rare2 > rare4 && rare2 > rare5 && rare2 > rare6 && rare2 > rare7 && rare2 > rare8 && rare2 > rare9 && rare2 > rare10 && rare2 > rare11 && rare2 > rare12)
                System.out.println("Наибольшее колличество раз выпала сумма 2 " + "- " + +rare2);
            if (rare3 > rare2 && rare3 > rare4 && rare3 > rare5 && rare3 > rare6 && rare3 > rare7 && rare3 > rare8 && rare3 > rare9 && rare3 > rare10 && rare3 > rare11 && rare3 > rare12)
                System.out.println("Наибольшее колличество раз выпала сумма 3 " + "- " + rare3);
            if (rare4 > rare2 && rare4 > rare3 && rare4 > rare5 && rare4 > rare6 && rare4 > rare7 && rare4 > rare8 && rare4 > rare9 && rare4 > rare10 && rare4 > rare11 && rare4 > rare12)
                System.out.println("Наибольшее колличество раз выпала сумма 4 " + "- " + rare4);
            if (rare5 > rare2 && rare5 > rare4 && rare5 > rare3 && rare5 > rare6 && rare5 > rare7 && rare5 > rare8 && rare5 > rare9 && rare5 > rare10 && rare5 > rare11 && rare5 > rare12)
                System.out.println("Наибольшее колличество раз выпала сумма 5 " + "- " + rare5);
            if (rare6 > rare3 && rare6 > rare4 && rare6 > rare5 && rare6 > rare2 && rare6 > rare7 && rare6 > rare8 && rare6 > rare9 && rare6 > rare10 && rare6 > rare11 && rare6 > rare12)
                System.out.println("Наибольшее колличество раз выпала сумма 6 " + "- " + rare6);
            if (rare7 > rare3 && rare7 > rare4 && rare7 > rare5 && rare7 > rare6 && rare7 > rare2 && rare7 > rare8 && rare7 > rare9 && rare7 > rare10 && rare7 > rare11 && rare7 > rare12)
                System.out.println("Наибольшее колличество раз выпала сумма 7 " + "- " + rare7);
            if (rare8 > rare3 && rare8 > rare4 && rare8 > rare5 && rare8 > rare6 && rare8 > rare7 && rare8 > rare2 && rare8 > rare9 && rare8 > rare10 && rare8 > rare11 && rare8 > rare12)
                System.out.println("Наибольшее колличество раз выпала сумма 8 " + "- " + rare8);
            if (rare9 > rare3 && rare9 > rare4 && rare9 > rare5 && rare9 > rare6 && rare9 > rare7 && rare9 > rare8 && rare9 > rare2 && rare9 > rare10 && rare9 > rare11 && rare9 > rare12)
                System.out.println("Наибольшее колличество раз выпала сумма 9 " + "- " + rare9);
            if (rare10 > rare3 && rare10 > rare4 && rare10 > rare5 && rare10 > rare6 && rare10 > rare7 && rare10 > rare8 && rare10 > rare9 && rare10 > rare2 && rare10 > rare11 && rare10 > rare12)
                System.out.println("Наибольшее колличество раз выпала сумма 10 " + "- " + rare10);
            if (rare11 > rare3 && rare11 > rare4 && rare11 > rare5 && rare11 > rare6 && rare11 > rare7 && rare11 > rare8 && rare11 > rare9 && rare11 > rare10 && rare11 > rare11 && rare11 > rare12)
                System.out.println("Наибольшее колличество раз выпала сумма 11 " + "- " + rare11);
            if (rare12 > rare3 && rare12 > rare4 && rare12 > rare5 && rare12 > rare6 && rare12 > rare7 && rare12 > rare8 && rare12 > rare9 && rare12 > rare10 && rare12 > rare11 && rare12 > rare2)
                System.out.println("Наибольшее колличество раз выпала сумма 12 " + "- " + rare12);

    }
}

