package udemy.exercise.arrayList;

import udemy.exercise.person.Person;

import java.util.ArrayList;

public class MobilePhoneList {

    private ArrayList<Person> contactPerson = new ArrayList<>();
    private Person person;

    public boolean addNewContact(String name, long number){
        int contactIn = getContactPosition(name);
        if (contactIn < 0) {
            person = new Person();
            person.setName(name);
            person.setContactPhoneNumber(number);
            contactPerson.add(person);
            return true;
        }
        return false;
    }

    private int getContactPosition (String name){
        int aux = -1;
        for (int i = 0; i < contactPerson.size(); i++) {
            person = contactPerson.get(i);
            if (person.getName().equals(name)){
                aux = i;
                i = contactPerson.size() + 1;
            }
        }
        return aux;
    }

    public boolean searchForContact (String name){
        int contactIn = getContactPosition(name);
        if (contactIn >= 0){
            return true;
        }
        return false;
    }

    public boolean removeContact(String name){
        int contactIn = getContactPosition(name);
        if (contactIn >= 0){
            contactPerson.remove(contactIn);
            return true;
        }
        return false;
    }

    public boolean updateContact(String oldName, String newName, long contactPhoneNumber){
        int contactIn = getContactPosition(oldName);
        if (contactIn >= 0){
            person = new Person();
            person.setName(newName);
            person.setContactPhoneNumber(contactPhoneNumber);
            contactPerson.set(contactIn, person);
            return true;
        }
        return false;
    }

    public void getContactList(){
        if (contactPerson.size() == 0){
            System.out.println("No contacts on your list!");
        } else{
            for (int aux = 0; aux < contactPerson.size(); aux++){
                person = new Person();
                person = contactPerson.get(aux);
                System.out.println(aux + ". " + person.getName() + " - " + person.getContactPhoneNumber());
            }
        }
    }
}