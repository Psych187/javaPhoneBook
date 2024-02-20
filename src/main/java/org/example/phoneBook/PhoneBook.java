package org.example.phoneBook;


import java.util.*;

public class PhoneBook {
    private final HashMap<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String name, String phoneNumber) {
        if (phoneBook.containsKey(name)) {
            List<String> phoneNumbers = phoneBook.get(name);
            phoneNumbers.add(phoneNumber);
        } else {
            List<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNumber);
            phoneBook.put(name, phoneNumbers);
        }
    }

    public void removeNumber(String name, String num) {
        if (phoneBook.containsKey(name)){
            List<String> phoneNumbers = phoneBook.get(name);
            phoneNumbers.remove(num);
        }
    }


    public void deleteContact(String name) {
        phoneBook.remove(name);
    }

    public void getAllContacts() {
        List<Map.Entry<String, List<String>>> sortList = new ArrayList<>(phoneBook.entrySet());
        sortList.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));

        for (Map.Entry<String, List<String>> entry : sortList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}