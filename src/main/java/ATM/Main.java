package ATM;

//Создать класс и объекты описывающие Банкомат.
// Набор купюр находящихся в банкомате должен задаваться тремя свойствами:
// количеством купюр номиналом 20 50 100. Сделать методы для добавления денег в банкомат.
// Сделать функцию снимающую деньги. На вход передается сумма денег.
// На выход – булевское значение (операция удалась или нет).
// При снятии денег функция должна рапечатывать каким количеством купюр какого номинала выдается сумма.
// Создать конструктор с тремя параметрами – количеством купюр.


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList=new ArrayList<>();
        personList.add(new Person("Alex",12341234,4321,5000));
        personList.add(new Person("Hanna",23452345,5432,300));
        personList.add(new Person("Kira",34563456,6543,700));


        CashMachine cashMachine1 = new CashMachine(15,15,3,2);


        cashMachine1.startMenu(personList);


    }
}
