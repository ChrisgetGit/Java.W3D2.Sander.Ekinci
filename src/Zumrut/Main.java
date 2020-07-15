package Zumrut;
import java.util.HashMap;



public class Main {
    public static void main(String[] args) {

        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Bonn");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");


        System.out.println(capitalCities.size());
        System.out.println(capitalCities.get("England"));        capitalCities.remove("England");        capitalCities.replace("Germany", "Berlin");
        System.out.println(capitalCities);        // the same with values

        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));    }

        capitalCities.clear();
        System.out.println(capitalCities);
    }
}
