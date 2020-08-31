package DZ_05;

//Написать программу, которая выведет на экран сколько
//        всего номеров придется исключить, если в распоряжении
//        армии имеется 100 тысяч единиц боевой техники и каждая
//        боевая машина имеет номер от 00000 до 99999. Решить,
//        используя строки.
public class Task06_ {

    public static void calc(String text) {
        StringBuilder number = new StringBuilder("00000");
        for (int i = 0; i < 99999; i++) {
//            Integer.parseInt(number + 1);
            System.out.println(number);
        }
//        return number;
    }

    public static void print(int count) {

    }


    public static void main(String[] args){
//    calc();
    }
}
