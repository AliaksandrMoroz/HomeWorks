package HomeWorkVladimir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person {

private long id;
private String name;
private String lastName;
private Role role;

    List<String> actionList= new ArrayList<>(Arrays.asList(
        SystemPanel.actionPerson((int) (Math.random()*4)),
        SystemPanel.actionPerson((int) (Math.random()*4)),
        SystemPanel.actionPerson((int) (Math.random()*4)),
        SystemPanel.actionPerson((int) (Math.random()*4))));

static int count=0;


    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Person(String name, String lastName, Role role) {
        this.id = count++;
        this.name = name;
        this.lastName = lastName;
        this.role=role;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", role=" + role ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        if (lastName != null ? !lastName.equals(person.lastName) : person.lastName != null) return false;
        return actionList != null ? actionList.equals(person.actionList) : person.actionList == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (actionList != null ? actionList.hashCode() : 0);
        return result;
    }
}
