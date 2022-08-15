public class Main {
    public static void main(String[] args) {

        Person mom = new PersonBuilder()
                .setName("Мария")
                .setSurName("Орлов(а)")
                .setAge(56)
                .setAddress("Хабаровск")
                .build();

        Person son = mom.newChildBuilder()
                .setName("Василий")
                .build();

        System.out.println("У " + mom + " есть сын, " + son);

        try {
            // Не хватает обязательных полей
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // Возраст недопустимый
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.getStackTrace();
        }
    }
}
