package DZ_05;

import java.util.Scanner;

//Напишите программу, которая будет печатать
//        ромбовидный рисунок на основе строки, введенной с
//        клавиатуры (максимальная длина – 50 символов).
public class Task10 {
    public static void scan() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое предложение:");
        String text = in.nextLine();
        calculate(text);
    }

    public static void calculate(String text) {
        String[] arrChar = text.split("");
        StringBuilder sb = new StringBuilder();

        String prob = " ";
        int count = text.length() -1;
        for (int i = 0; i < arrChar.length - 1; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(prob);
            }
            count--;
            sb.append(arrChar[i]);
            System.out.println(sb);
        }

        for (int i = 0; i < arrChar.length; i++) {
            System.out.println(text.substring(i));
        }


    }

//    public static void print(StringBuilder sb) {
//        System.out.println(sb);
//    }


    public static void main(String[] args) {
        scan();
    }
}
