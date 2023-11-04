package gb;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Alexey", "+79548670193");
        phoneBook.addContact("Sergey", "+79915484359");
        phoneBook.addContact("Max", "+79571960496");
        phoneBook.addContact("Sergey", "+79386748396");
        phoneBook.addContact("Sergey", "+79278591034");
        phoneBook.addContact("Max", "+77568690584");
        phoneBook.addContact("Dmitry", "+79749017532");
        phoneBook.addContact("Max", "+77568690584");
        phoneBook.addContact("Dmitry", "+77568968484");

        List<Contact> contactList = phoneBook.transferToSortedContactList();

        contactList.forEach(System.out::println);
    }
}
