package Christian.A2;

import java.util.HashMap;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String,String> phoneBook = new HashMap<>();

        phoneBook.put("Christian Sander", "0664 68 17 555");
        phoneBook.put("Sebastian Wels", "0650 62 12 155");
        phoneBook.put("Max Mueller", "0669 12 34 456");


        System.out.printf("%-18s %15s", "NAME", "NUMBER"+"\n");
        for(String i : phoneBook.keySet()){
            System.out.printf("%-25s %15s" ,i , phoneBook.get(i)+"\n");
        }

    }






}
