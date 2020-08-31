package DZ_05;

import java.util.Scanner;
//Ввести строку с клавиатуры. В строке должны содержаться
//        слова, которые могут быть раздельные пробелами или
//        двоеточиями. Необходимо вычислить количество слов в
//        строке, у которых четное количество букв.
public class Task05 {
    public static void scan() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = in.nextLine();

        calc(text);
    }

    public static void calc(String text) {
         String [] arrStr = text.split(": |\\s");
         int count = 0;
        for (String s : arrStr) {
            if(s.length()%2 ==0) count++;
        }
        print(count);
    }

    public static void print(int count) {
        System.out.println("В тексте " + count + " слов с четным количеством букв.");
    }


    public static void main(String[] args) {
        scan();
    }
}
