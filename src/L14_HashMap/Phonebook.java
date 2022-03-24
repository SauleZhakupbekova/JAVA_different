package L14_HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Phonebook {
    public HashMap<String, List<String>> phonebook = new HashMap<>();

    public void addContact(String name, String phonenumber){
        if(phonebook.containsKey(name)){
            List<String> phonelist = phonebook.get(name);
            if(!phonelist.contains(phonenumber)) {
                phonelist.add(phonenumber);
            }
            phonebook.put(name, phonelist);

        }else{
            ArrayList<String> phones = new ArrayList<>();
            phones.add(phonenumber);
            phonebook.put(name, phones);

        }
    }
    public void printAllContacts(){
        for(String contact:phonebook.keySet()){
            System.out.println(contact + ": " + phonebook.get(contact));
        }
    }
}
