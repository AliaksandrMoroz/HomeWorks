package TaskManual.Task24;

//        Создать класс и объекты описывающие промежуток времени.
//        Сам промежуток в классе должен задаваться тремя свойствами:
//        секундами, минутами, часами. Сделать методы для получения полного количества секунд в объекте,
//        сравнения двух объектов (метод должен работать аналогично compareTo в строках).
//        Создать два конструктора: получающий общее количество секунд, и часы, минуты и секунды по отдельности.
//        Сделать метод для вывода данных.

public class Main {
    public static void main(String[] args) {
        TimeInterval timeInterval =new TimeInterval(2,25,45);
        TimeInterval timeInterval1 =new TimeInterval(2,35,45);
        TimeInterval timeInterval2= new TimeInterval(5000);

//        System.out.println(timeInterval.allSeconds());
        System.out.println(timeInterval.equals(timeInterval1));
//        System.out.println(timeInterval1);
//        System.out.println(timeInterval2);
//        System.out.println(timeInterval.compareToTimeInterval(timeInterval1));
    }
}
