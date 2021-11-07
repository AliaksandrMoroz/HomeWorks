package TaskManual.Task20;


public class Main {
    public static void main(String[] args) {
        String string = "Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.";
        String[] arrayStr=string.split("[^a-zA-Zа-яА-Я0-9_]+");
        for (int i = 0; i < arrayStr.length; i++) {
            System.out.print(arrayStr[i].charAt(arrayStr[i].length()-1));
        }
    }
}
