package Zumrut.A2;

import java.util.HashMap;
import java.util.Scanner;


public class TelephoneBook {
    public static void main(String[] args) {

        // HashMap object called people
        HashMap<String, Integer> people = new HashMap<String, Integer>();

        // Keys and values (Name, Number)
        people.put("John", 328978);
        people.put("Joan", 308990);
        people.put("Joanna", 339067);

        for (String i : people.keySet()) {
            System.out.println("Name: " + i + " Number: " + people.get(i));
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name= ");
        String name = sc.next();

        if(people.containsKey(name)) {
            System.out.println(name + "= "+ people.get(name));
        }

    }
}
