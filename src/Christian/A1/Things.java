package Christian.A1;
import java.util.HashMap;
public class Things {


    public static void main(String[] args) {
        HashMap<String, String> things = new HashMap<String, String>();
        things.put("yellow", "Banana");
        things.put("orange", "Orange");
        things.put("green", "Apple");
        things.put("red", "Strawberry");
        things.put("brown", "Potato");

        System.out.println(things);

        System.out.println(things.get("yellow"));

        for (String i : things.keySet()) {
            if (i == "yellow") {
                System.out.println("key = " + i + " --> value = " + things.get(i));
            }

        }
        System.out.println("Number of keys = " + things.size());

        things.clear();
        System.out.println(things);
        things.put("yellow", "Banana");
        things.put("orange", "Orange");
        things.put("green", "Apple");
        things.put("red", "Strawberry");
        things.put("brown", "Potato");

        for (String i : things.keySet()) {
            System.out.println(i + " --> " + things.get(i));
        }

        things.replace("red", "Strawberry", "Cherry");

        System.out.println("\n NEW");
        for (String i : things.keySet()) {
            System.out.println(i + " --> " + things.get(i));
        }
        // get the HashMap object from the method init()

        // replace the id 18975 with a new student
        String result = things.replace("red", "Red apple");
        if (result != null) {
            System.out.println("\nThing " + result
                    + " has been replaced on the thing database");
        } else {
            System.out.println("\nSpecified thing not found");
        }

        System.out.println("\n NEW");
        for (String i : things.keySet()) {
            System.out.println(i + " --> " + things.get(i));

        }



    }
}
