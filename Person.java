abstract class Person implements Scientist{
    private String name;
    private Person[] depend;

    public String getName() {
        return name;
    }

    abstract void dependPerson(Person person);

    @Override
    public void study() {
        System.out.println("He/She is a student");
    }

    @Override
    public void teach() {
        System.out.println("He/She is a teacher");
    }
}
