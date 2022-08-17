public class Person {
    protected final String name;
    private final String surname;
    private int age;
    private String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public boolean hasAge() {
        return age >= 0;
    }

    public boolean hasAddress() {
        return address != null;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        if (hasAge()) age++;
        else System.out.println("Возраст неизвестен!");
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurName(getSurname()).setAddress(getAddress()).setAge(1);
    }

    @Override
    public String toString() {
        return name + " " + surname + "(" + age + " лет, " + address + ")";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
