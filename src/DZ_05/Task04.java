package DZ_05;

import java.util.Scanner;

public class Task04 {

//    Ввести строку с клавиатуры (латиницей). Из введенной
//    строки выбрать все слова, начинающиеся на гласные буквы
//    и заканчивающиеся на согласные. Вывести отобранные
//    слова на консоль.

    public static void scanner() {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        game(str);
    }

    public static void print(String str) {
        System.out.print(str + " ");
    }

    public static void game(String s) {

        String[] arrString = s.split(" ");
        String h = "^(?i:[aeiouy]).*";
        for (String s1 : arrString) {
            String [] arrString2 = s1.split(" ");
            if(arrString2[0].matches(h) || arrString2[arrString2.length -1].matches(h)){
                print(s1);
            }
        }
    }

    public static void main(String[] args) {

        scanner();

    }
}
