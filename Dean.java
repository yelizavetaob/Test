public class Dean extends Person {
    String name;
    Person[] depend;

    public String getName() {
        return name;
    }

    public void setName(String subject) {
        this.name = subject;
    }

    public Person[] getDepend() {
        return depend;
    }

    public void setDepend(Person[] depend) {
        this.depend= depend;
    }
    @Override
    void dependPerson(Person person) {
        System.out.println(person.getName());
    }
}
