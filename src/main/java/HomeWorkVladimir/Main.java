package HomeWorkVladimir;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
            SystemPanel.personList = Arrays.asList(
                    new Person("Alex", "Frost", Role.WORKER),
                    new Person("Vasiliy", "Petrovich", Role.PENSIONER),
                    new Person("Adil", "Sheih", Role.PUPIL),
                    new Person("Aleksei", "ASOI", Role.STUDENT)
            );
            SystemPanel.updatePersonListMap();

      Menu.showMenu();
    }
}
