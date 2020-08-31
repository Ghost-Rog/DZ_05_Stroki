package DZ_05;

import java.util.Scanner;

//Написать программу, которая создаст строку, в которой
//        находятся все целые числа, начиная с 1, выписаны в одну
//        строку «123456789101112131415...». Строка должна быть
//        длиной не более 1 000 символов.
//        По числу n (введенного с клавиатуры), выведите цифру на
//        n-й позиции (используется нумерация с 1).
public class Task02 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        StringBuilder sBuilder = new StringBuilder();
        for (int i = 1; i < 1000; i++) {
            if (sBuilder.length() < 1000 - 3) {
                sBuilder.append(i);
            } else break;
        }
        System.out.println(sBuilder.toString());
        System.out.println(sBuilder.toString().charAt(x));

    }
}