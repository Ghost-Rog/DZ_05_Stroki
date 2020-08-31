package DZ_05;

import java.util.Scanner;
//        В языке Java принято первое слово, входящее в название переменной, записывать с маленькой латинской буквы.
//        Следующее слово идет с большой буквы (только первая буква слова – большая). Слова не имеют разделителей и
//        состоят только из латинских букв. Например, правильные записи переменных в Java могут выглядеть следующим
//        образом: javaIdentifier, longAndMnemonicIdentifier, name, nEERC. В языке C++ для описания переменных используются
//        только маленькие латинские символы и символ «_», который отделяет непустые слова друг от друга. Если
//        строка имеет смешанный синтаксис: например java_ Identifier, сообщить об этом. Примеры: java_identifier,
//        long_and_mnemonic_identifier, name, n_e_e_r_c.
//        Вам требуется написать программу, которая преобразует переменную, записанную на одном языке, в формат другого
//        языка. Идентификатор (имя) переменной должен вводится с клавиатуры. Программа должна определить, из какого языка
//        взята переменная, и переделать ее в переменную другого языка. Вывести результат на консоль.
public class Task08 {
    public static void scan() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = in.nextLine();
        calculate(text);
    }

    public static void calculate(String text) {
        boolean b = text.contains("_");

        StringBuilder sb = new StringBuilder();
        if (b) {
            String[] arrString = text.split("[_]");
            sb.append(arrString[0]);
            for (int i = 1; i < arrString.length; i++) {
                char firstElement = Character.toUpperCase(arrString[i].trim().charAt(0));
                sb.append(arrString[i]);
                sb.setCharAt(sb.length() - arrString[i].trim().length() , firstElement);
            }
        } else {
            String[] arrString = text.split("(?=[A-Z])");
            for (int i = 0; i < arrString.length; i++) {
                sb.append(arrString[i].toLowerCase()).append("_");
            }
            sb.setLength(sb.length() -1);
        }
        print(sb);
    }

    public static void print(StringBuilder sb) {
        System.out.println(sb);
    }


    public static void main(String[] args) {
        scan();
    }
}
