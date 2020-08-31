package DZ_05;

import java.util.Scanner;

//Пользователь вводит с клавиатуры любую строку.
//        Поменять в исходной строке все большие буквы на
//        маленькие, а маленькие – на большие. Если в строке присутствуют цифры, заменить на символ подчеркивания и
//        вывести результат на консоль.
public class Task07 {
    public static void scan() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = in.nextLine();
        calc(text);
    }

    public static void calc(String text) {
        char [] arr = text.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if(Character.isUpperCase(arr[i])){
                sb.append(Character.toLowerCase(arr[i]));
            } else if(Character.isLowerCase(arr[i])){
                sb.append(Character.toUpperCase(arr[i]));
            } else if(Character.isDigit(arr[i])){
                sb.append("_");
            } else {
                sb.append(arr[i]);
            }
        }
        print(sb);
    }

    public static void print(StringBuilder sb) {
        System.out.println(sb);
    }


    public static void main(String[] args){
    scan();
    }
}
