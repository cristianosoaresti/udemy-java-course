package udemy.exercise.person;

public class Person {

    private String name;
    private long contactPhoneNumber;

    public long getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactPhoneNumber(long contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }
}