package DZ_05;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//Написапроть программу, проверяющую является ли одна
//    строка анаграммой для другой строки (строка может состоять из нескольких слов и символов пунктуации). Пробелы и
//    пунктуация должны игнорироваться при анализе. Разница в больших и маленьких буквах должна игнорироваться. Обе
//    строки должны вводиться с клавиатуры. Программа должна выводить Yes, если строки являются анаграммой, и No – иначе.
//    Пример анаграммы в стихах:
//    Строка 1 «Аз есмь строка, живу я, мерой остр».
//    Строка 2 «За семь морей ростка я вижу рост!»
public class Task09 {
    public static void scan() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое предложение:");
        String textOne = in.nextLine();
        System.out.println("Введите второе предложение:");
        String textTwo = in.nextLine();
        calculate(textOne,textTwo);
    }

    public static void calculate(String textOne, String textTwo) {
        String [] arrTextOne = textOne.toLowerCase().split("\\s|\\.|,|»|«|!|\\?");
        String [] arrTextTwo = textTwo.toLowerCase().split("\\s|\\.|,|»|«|!|\\?");
        int x = arrTextOne.length;


        for (String s : arrTextOne) {
            System.out.print(s);
        }
        System.out.println();

        for (String s : arrTextTwo) {
            System.out.print(s);
        }



    }

    public static void print(boolean b) {
        System.out.println(b);
    }


    public static void main(String[] args) {
        scan();
    }
}
