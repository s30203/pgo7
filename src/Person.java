public abstract class Person {
    public String firstName;
    public String lastName;
    public int birthdayYear;
    public Person(String firstName, String lastName, int birthdayYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdayYear = birthdayYear;
    }
    public int getAge() {
        return java.time.Year.now().getValue() - birthdayYear;
    }
}
