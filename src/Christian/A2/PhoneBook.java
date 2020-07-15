package Christian.A2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Christian Sander", "0664 68 17 555");
        phoneBook.put("Sebastian Wels", "0650 62 12 155");
        phoneBook.put("Max Mueller", "0669 12 34 456");


        System.out.printf("%-18s %15s", "NAME", "NUMBER" + "\n");
        for (String i : phoneBook.keySet()) {
            System.out.printf("%-25s %15s", i, phoneBook.get(i) + "\n");
        }


        Scanner sc1 = new Scanner(System.in);
        System.out.print("\n\nEnter Name to SEARCH: ");
        String searchName = sc1.next();

        for (String i : phoneBook.keySet()) {
            if (i == searchName){
                System.out.printf("%-18s" , searchName);
            }

        }


        Scanner sc2 = new Scanner(System.in);
        System.out.print("\n\nEnter Name to DELETE: ");
        String deleteName = sc2.next();

        Iterator<String> iterator = phoneBook.keySet().iterator();
        while (iterator.hasNext()) {
            String nextIterator = iterator.next();
            if (nextIterator.contains(deleteName)) {
                System.out.print("\nRemoved:\n"+nextIterator);
                iterator.remove();
            }


        }

        System.out.print("\n\n" + "New phone book:");
            for (String i : phoneBook.keySet()) {
                System.out.printf("\n%-24s %15s", i, phoneBook.get(i));

        }

    }
}
