package DZ_05;

import java.util.Scanner;
//Ввести с клавиатуры строку текста, а затем один символ.
//        Показать на консоль индексы и количество совпадений (ищем
//        вхождения символа в строку). В случае если совпадений не
//        найдено, вывести соответствующий текст.
public class Task01 {

    public static void scan() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = in.nextLine();
        System.out.println("Введите символ для поиска");
        String charr = in.next();
        index(text, charr);
    }

    public static void index(String text, String charr) {
        int count = 0;
        String[] array = text.split("");

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(charr)) {
                System.out.println(i);
                count++;
            }
        }
        boolean b = count > 0;


        print(b, count);

    }

    public static void print(boolean b, int count) {
        if (b) {
            System.out.println(count);
        } else {
            System.out.println("Совпадений нет");
        }
    }


    public static void main(String[] args) {
        scan();
    }
}
