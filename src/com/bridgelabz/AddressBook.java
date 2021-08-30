package com.bridgelabz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBook implements AddressBookInterface{
    Scanner s = new Scanner(System.in);
    ArrayList<Person> list = new ArrayList<Person>();

    public void operation(ArrayList<Person> arrayRead) {
        // list=AddressManager.listReturn();
        list = arrayRead;
        boolean status = true;
        do {
            System.out.println("Choose Operation you want to do");
            System.out
                    .println("1. Add\t2. Edit\t3. SortById\t4. SortByZip\t5. Show\t6. Back");
            switch (s.nextInt()) {
                case 1:
                    add();
                    break;
                case 2:
                    edit();
                    break;
                case 3:
                    sortByLastname();
                    break;
                case 4:
                    sortByZip();
                    break;
                case 5:
                    print();
                    break;
                case 6:
                    status = false;
                    break;
            }
        } while (status);
    }

}
