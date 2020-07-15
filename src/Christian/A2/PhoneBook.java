package Christian.A2;

import java.util.HashMap;
import java.util.Iterator;

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

        System.out.println("\nName search:");

        String searchName = "Christian Sander";
        for (String i : phoneBook.keySet()) {
            if (i.equals(searchName)) {
                System.out.printf("%-24s %15s", searchName, phoneBook.get(i));

            }

        }
        Iterator<String> iterator = phoneBook.keySet().iterator();

        String deleteName = "Sebastian Wels";
        while (iterator.hasNext()) {
            String nextIterator = iterator.next();
            if (nextIterator.contains(deleteName)) {
                System.out.print("\n\nRemove:\n"+nextIterator+nextIterator);
                iterator.remove();
            }


        }

        System.out.print("\n\n" + "New phone book:");
            for (String i : phoneBook.keySet()) {
                System.out.printf("\n%-24s %15s", i, phoneBook.get(i));

        }

    }
}
