package HomeWorkVladimir;

import java.util.*;

public class SystemPanel {
    static Map<Person, List<String>> personListMap = new HashMap<>();
    static List<Person> personList = new ArrayList<>();


    public static void updatePersonListMap() {
        for (Person person :
                personList) {
            personListMap.put(person, person.actionList);
        }
    }

    public static void showAllPersonWithActions() {
        for (Map.Entry<Person, List<String>> entry :
                personListMap.entrySet()) {
            System.out.println(entry.getKey() + ":\n" + entry.getValue()+"\n");
        }
        System.out.println("___________________________");
    }

    public static void deletePersonAction(String nameAndLastName) throws PersonNotFoundException {
        String[] arrayNameAndLastName = nameAndLastName.trim().split("\\W+");
        for (Map.Entry<Person, List<String>> entry :
                personListMap.entrySet()) {

            if ((entry.getKey().getName().equalsIgnoreCase(arrayNameAndLastName[0])) && (entry.getKey().getLastName().equalsIgnoreCase(arrayNameAndLastName[1]))) {
                entry.getValue().clear();
                System.out.println("Person " + arrayNameAndLastName[0] + " " + arrayNameAndLastName[1] + " action deleted!");
                Menu.showMenu();
            } else {
            }
        }
        throw new PersonNotFoundException("Person not found");
    }


    public static void addActionFromUser(String userName) {
        for (Person el :
                personList) {
            if (el.getName().equalsIgnoreCase(userName)) {
                el.actionList.add(Menu.userChoice());
            } else {
                System.out.println("User with this name was not found!");
            }
        }
    }

    public static void addPerson() {
        List<Person> addPersonList= new ArrayList<>();
        System.out.println("Entered person name and lastname");
        String[] nameAndLastName = Menu.userChoice().trim().split("\\W+");
        System.out.println("Choose Role:\n" +
                "1. PUPIL\n" +
                "2. STUDENT\n"+
                "3. WORKER\n" +
                "4. PENSIONER"
        );
        try{
        int choice = Integer.parseInt(Menu.userChoice());
        switch (choice) {
            case 1:  addPersonList.add(new Person(nameAndLastName[0],nameAndLastName[1],Role.PUPIL));break;
            case 2:  addPersonList.add(new Person(nameAndLastName[0],nameAndLastName[1],Role.STUDENT));break;
            case 3:  addPersonList.add(new Person(nameAndLastName[0],nameAndLastName[1],Role.WORKER));break;
            case 4:  addPersonList.add(new Person(nameAndLastName[0],nameAndLastName[1],Role.PENSIONER));break;
            default:
        }
        personListMap.put(addPersonList.get(0),addPersonList.get(0).actionList);
        }catch (NumberFormatException e){
            System.err.println("Incorrect input, please try again");

        }
    }


    public static String actionPerson(int value) {
        switch (value) {
            case 1:
                return "Person eating";
            case 2:
                return "Person sleeping";
            case 3:
                return "Person talking";
            default:
                return "Person crash";
        }
    }

    public static void deletePerson(String nameAndLastName) throws PersonNotFoundException {
        String[] arrayNameAndLastName = nameAndLastName.trim().split("\\W+");
        if (!personListMap.entrySet()
                .removeIf(entry -> arrayNameAndLastName[0].equalsIgnoreCase(entry.getKey().getName())
                        &&
                        arrayNameAndLastName[1].equalsIgnoreCase(entry.getKey().getLastName())))
        {
        throw new PersonNotFoundException("Person not found");    }
        }

    public static void showPersonAction(String nameAndLastName) throws PersonNotFoundException {
        String[] arrayNameAndLastName = nameAndLastName.trim().split("\\W+");
        for (Map.Entry<Person, List<String>> entry :
                personListMap.entrySet()){
            if ((entry.getKey().getName().equalsIgnoreCase(arrayNameAndLastName[0])) && (entry.getKey().getLastName().equalsIgnoreCase(arrayNameAndLastName[1]))) {
                System.out.println(entry.getKey()+ " : "+ entry.getValue());
                System.out.println("___________________________");
                Menu.showMenu();
            } else {
            }
        }
        throw new PersonNotFoundException("Person not found");
        }

    public static void showPerson() {
        if(personListMap!=null){
        for (Map.Entry<Person, List<String>> entry :
                personListMap.entrySet()){
            System.out.println(entry.getKey().getName()+ " "+ entry.getKey().getLastName());
        }
        }else {
        }
        System.out.println("_____________________");
    }

}

