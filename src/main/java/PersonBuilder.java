public class PersonBuilder {

    String name;
    String surname;
    int age;
    String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return PersonBuilder.this;
    }

    public PersonBuilder setSurName(String surname) {
        this.surname = surname;
        return PersonBuilder.this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return PersonBuilder.this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return PersonBuilder.this;
    }

    public Person build() {
        if (this.name == null || this.surname == null) {
            throw new IllegalStateException("Указанны не все данные!");
        }

        if (this.age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным!");
        }
        return new Person(this.name, this.surname, this.age, this.address);
    }

}
