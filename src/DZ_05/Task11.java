package DZ_05;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Write the word:");
        String text = in.nextLine();

        String mainTest = ".([d-z]).";
        String texst = ".[\\d].|[\\d]|.[\\d]|[\\d].";
//        String firstTest = "(\d)|[b]{2}|[ab]{3}";
        String secondTest= "[abc]{3}";
        String thirdTest = "([d-z])";
//        String firstTest = "([d-z])";
//        String firstTest = "([d-z])";


            if(text.matches(texst)){
                System.out.println("This word so bad ;D");
                System.exit(0);
            }
//            else if(text.matches(secondTest)){
//                System.out.println("This word so bad ;D");
//                System.exit(0);
//            }



    }
}
