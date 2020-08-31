package OOP;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Decimal dc = new Decimal(in.nextFloat(), in.nextFloat());

        System.out.println(dc.addition());
        System.out.println(dc.subtraction());
        System.out.println(dc.multiplication());
        System.out.println(dc.division());

//        System.out.println(3.5 + 5.7);


    }




}
