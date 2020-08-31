package DZ_05;

import java.util.Scanner;
//    Подсчитать среднюю длину слова, во введенном с
//    клавиатуры предложении.
public class Task03 {

    public static void calc(String s) {

        String[] arrString = s.split(" ");
        int count = 0;
        int length = 0;
        for (String s1 : arrString) {
            length += s1.length();
            count++;
        }
        Print(length / count);

    }

    public static void Scanner() {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        calc(str);

    }


    public static void Print(int x) {
        System.out.println(x);
    }

    public static void main(String[] args) {

        Scanner();

    }
}
