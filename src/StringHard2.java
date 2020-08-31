public class StringHard2 {

    public static void main(String[] args) {
        String str = "В июне текущего года Илон Маск сообщил, что SpaceX построит новый плавучий космодром 100500." +
                " в качестве основы будут использоваться модернизированные нефтяные вышки, а сам он расположится" +
                " недалеко от Бока-Чика, штат Техас. как стало 56485 известно, SpaceX планирует превратить стартовую площадку" +
                " в курорт, сочетающий высокие технологии с комфортом для сотрудников.";
        StringBuilder myStringBuilder = new StringBuilder();

        String[] array = str.split("\\."); //развибваем текст на предложения через точку(.)

        for (int i = 0; i < array.length; i++) {

            //записываем в firstElement 1ую букву в верхнем регистре на основании 1го элемента строки (массива)
            char firstElement = Character.toUpperCase(array[i].trim().charAt(0));

            // создаём i-ое предложение и конкантенируем с точкой(.) т.к. мы её удалили при использовании split()
            myStringBuilder.append(array[i]).append(".");

            //создаём i-ое предложение через все предложене (его длинну) и вычитанием всех символов - 1 и заменяем на firstElement
            //То есть, по сути пересоздаём предложение заменяя 1ую бувку на букву в верхнем регистре
            myStringBuilder.setCharAt(myStringBuilder.length() - array[i].trim().length() - 1, firstElement);

        }
        System.out.println(myStringBuilder);
    }
}
