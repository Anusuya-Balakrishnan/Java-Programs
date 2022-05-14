package MyMobilePhone;

import java.util.*;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobileobject = new MobilePhone("1236423");
    public static void main(String[] args) {
        
        int a = 0;
        menu();
        while (a >= 0) {
            System.out.println("enter option");
            int option = scanner.nextInt();
            switch (option) {
                case 0:
                    menu();
                    a = 1;
                    break;
                case 1:
                    addmobile();
                    a = 2;
                    break;
                case 2:
                    updatemobile();
                    a = 3;
                    break;
                case 3:
                    removecontact();
                    a = 4;
                    break;
                case 4:
                    queryContact();
                    a = 5;
                    break;
                case 5:
                    displayContact();
                    a = 6;
                    break;
                case 6:
                    a = -1;
                    break;                 
            }
        }
    }

    public static void addmobile() {
        System.out.print("Enter name: ");
        String name = scanner.next();
        scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phonenumber = scanner.next();
        Contact addvalue = Contact.createContact(name, phonenumber);
        if (mobileobject.addNewContact(addvalue)) {
            System.out.println("New Contact added: name= "+name+" ,phone= "+phonenumber);
        } else {
            System.out.println("Contact already exists");
        }
    }

    public static void updatemobile() {
        System.out.println("Enter  old contact Name");
        String oldName = scanner.next();
        scanner.nextLine();
        Contact oldContact = mobileobject.queryContact(oldName);
        if(oldContact==null)
        {
            System.out.println("Contact not found");
        }
        else
        {
        System.out.println("Enter  new contact Name");
        String newName = scanner.next();
        scanner.nextLine();
        System.out.println("Enter new contact phonenumber");
        String newPhonenumber = scanner.next();
        Contact newContact = Contact.createContact(newName, newPhonenumber);
        if (mobileobject.updateContact(oldContact, newContact)) {
            System.out.println("Contact updated successfully");
        } else  {
            System.out.println("Old contact already exists");
        }
            
        }
        
    }

    public static void menu() {
        System.out.println("0. Main Menu"
                + "\n 1. Add new Contact "
                + "\n 2.update existing Contact "
                + "\n 3.Remove existing contact "
                + "\n 4.Query the contact "
                + "\n 5. diplay all contacts "
                + "\n 6. exist");
    }

    public static void removecontact() {
        System.out.println("enter contact name to remove");
        String nameRemove = scanner.next();
        Contact oldContact = mobileobject.queryContact(nameRemove);
        if(oldContact==null)
        {
            System.out.println("Contact not found");
        }
        else{
          if (mobileobject.removeContact(oldContact)) {
            System.out.println("Contact removed successfully");
        } else {
            System.out.println("contact not exists");
        }  
        }
        
    }

    public static void queryContact() {
        System.out.println("Enter name");
        String name = scanner.next();
        Contact contactValue=mobileobject.queryContact(name);
        if(contactValue==null)
        {
            System.out.println("Contact not exists");
        }
        else
        {
          System.out.println("Name: "+contactValue.getName()+"Phone Number: "+contactValue.getPhoneNumber());  
        }
    }
    public static void displayContact()
    {
        mobileobject.printContacts();
    }

}
